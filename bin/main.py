# coding=utf-8

import click
from extr_db import check_db, run_orders, run_order
from sql_handler.mysql_connector import mysql_db
import re
import sys

@click.command()
@click.option('--g', help='group of mission')
@click.option('--t', help='ETL_JOB')
@click.option('--d', help='TX_DATE')
@click.option('--s', help='ETL_SYS')
def main(g, t, d, s):
    if not ((g or t) and d and s):
        print "参数不符合规范，请检查参数"
        return -1
    elif not re.match(r'\d{8}', d):
        print "日期参数不符合规范,应为YYYYMMDD格式"
        return -1
    elif g:
        run_orders(g, d, s)
    else:
        mysqldb = mysql_db()
        job_id = mysqldb.get_jobid(s, t, d)
        order = check_db(t, d, s, mysqldb)
        run_order(order, t, d, s, mysqldb)

def run_job(etl_sys, etl_job, tx_dt):
    scripts = get_scripts(etl_sys, etl_job)
    for i in scripts:
        order = i + ' -s ' + etl_sys + ' -t ' + etl_job + ' -d ' + tx_dt + ' -id ' + str(jobid)
        status, log = commands.get_statusoutput(order)

def get_scripts(etl_sys, etl_job):
    script_path = '../APP' + etl_sys.lower() + '/' + etl_job.lower()
    try:
        script_list = os.listdir(script_path)
        script_list.sort()
        for i in script_list:
            i = script_path + '/' + i
        return script_list
    except BaseException, error:
        print error
        sys.exit(0)

if __name__ == '__main__':
    main()
