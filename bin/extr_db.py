#!/usr/bin/python
# coding=utf-8

import click
import commands
from sql_handler.mysql_connector import mysql_db
from sqoop_order.sqoop_order import order_without_sql, order_with_sql
from hive_handler.hive_cursor import hive_handler
import os
import json
import re
from multiprocessing import Process, Lock
import time

@click.command()
@click.option('--t', help='ETL_JOB')
@click.option('--d', help='TX_DATE')
@click.option('--s', help='ETL_SYSTEM')
@click.option('--id', help='ETL_JOB_ID')
def main(t, d, s, id):
    if not (t and d and s):
        print ('参数不符合规范，请检查参数')
        return 0
    else:
        mysqldb = mysql_db(s, t, d)
        order = check_db(t, d, s, mysqldb)
        run_order(order, t, d, s, id, mysqldb)

def run_orders(g, d, s):
    mysqldb = mysql_db(s, None, d, g)
    processes = []
    tot_resp = mysqldb.get_maps_num(g, d, s)
    jobs = mysqldb.get_jobs(g, d, s)
    for i in jobs:
        order = check_db(i, d)
        job_id = mysqldb.get_jobid(s, i, d)
        print order
        curr_maps = mysqldb.get_curr_maps(g)
        while curr_maps >= tot_resp:
            curr_maps = mysqldb.get_curr_maps(g)
            time.sleep(5)
        p = Process(target=run_order, args=(order, i, d, s, job_id, mysqldb))
        processes.append(p)
        p.start()
    for p in processes:
        p.join()

def check_db(t, d, s, db):
    hive_cur = hive_handler(s, t, d)
    data = json.loads(db.get_etl_conf_db())
    dbtype = data['db_type']
    # etl_system,db_type,map_num,split_key,sc_dbname,sc_tbname,hv_dbname,hv_tbname,usequery,etl_job
    hv_dbname = data['hv_dbname']
    data['etl_job'] = data['etl_job'] + '_' + d
    etl_job = data['etl_job']
    sc_tbname = data['sc_tbname']
    usequery = int(data['usequery'])
    if not usequery :
        sqoop_str = order_without_sql(data, dbtype)
    else:
        sqoop_str = order_with_sql(data, dbtype)
    htb_name = hv_dbname + '.' + etl_job
    hive_cur.check_htb_exist(htb_name)
    db.update_etl_job_start()
    return sqoop_str

def run_order(sqoop_str, etl_job, tx_dt, etl_sys, ID, db):
    print sqoop_str
    status, output = commands.getstatusoutput(sqoop_str)
    lines = output
    print lines
    lines = re.split('\n', lines)
    judge = 0
    log_handler(lines, etl_sys, etl_job, tx_dt, ID)
    for j in lines:
        if re.match(r".*INFO  \[main\] hive.HiveImport: Hive import complete.*", j):
            judge = 1
            break
    db.update_etl_job_end(judge)

def log_handler(log, etl_sys, etl_job, tx_dt, ID):
    log_dir = '../log/'+ etl_sys + '/' + tx_dt
    if not os.path.exists(log_dir):
        os.makedirs(log_dir)
    logfile = log_dir + '/' + etl_job + '_200_' + ID + '.log'
    with open(logfile, 'a') as file:
         for line in log:
             file.write(line + '\n')

if __name__ == '__main__':
    main()
