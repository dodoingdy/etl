# coding=utf-8

import MySQLdb
import time
import mysql_config
import json
import sys
from log_handler.log_handler import log_handler
import os

class mysql_db():
    conn = None
    etl_sys = None
    etl_job = None
    tx_dt = None
    group = None

    def __init__(self, etl_sys=None, etl_job=None, tx_dt=None, group=None):
        self.conn =  MySQLdb.connect(
                   host = mysql_config.host,
                   port = mysql_config.port,
                   user = mysql_config.user,
                   passwd = mysql_config.passwd,
                   charset = mysql_config.charset)
        self.etl_sys = etl_sys
        self.etl_job = etl_job
        self.tx_dt = tx_dt
        self.group = group
    
    def update_etl_job_start(self):
        t1 = time.strftime('%Y-%m-%d %H:%M:%S',time.localtime(time.time()))
        sql = "update ETL.ETL_JOB set last_starttime='" + t1 + "',last_txdate='" + self.tx_dt + "',last_jobstatus='R' where etl_job='" + self.etl_job+ "';"
        self.exec_sql(sql, 0)

    def get_jobid(self):
        sql = "select cast(ifnull(max(job_id)+1,1001) as char) from ETL.ETL_JOB_LOG where etl_system='" + self.etl_sys + "' and etl_job='" + self.etl_job + "' and tx_date='" + self.tx_dt + "';"
        jobid = exec_sql(sql, 1)
        return str(jobid[0])
    
    def get_maps_num(self):
        sql = "select tot_resp from ETL.ETL_GROUP where etl_group='" + self.group + "';"
        tot_resp = self.exec_sql(sql, 1)
        return tot_resp[0]
    
    def get_jobs(self):
        sql = "select etl_job from ETL.ETL_JOB where enable='1' and etl_group = '" + self.group + "' order by priority desc;"
        result = self.exec_sql(sql, 2)
        data = []
        for i in result:
            data.append(i[0])
        return data
    
    def get_curr_maps(self):
        sql = "select sum(conf.map_num) from ETL.ETL_CONF_DB conf left outer join ETL.ETL_JOB b on conf.etl_job=b.etl_job where b.last_jobstatus='R' and b.etl_group='" + self.group + "';"
        curr_maps = self.exec_sql(sql, 1)
        return curr_maps[0]
    
    def update_etl_job_end(self, judge):
        t2 = time.strftime('%Y-%m-%d %H:%M:%S',time.localtime(time.time()))
        if not judge:
            sql = "update ETL.ETL_JOB set last_endtime='" + t2 + "',last_jobstatus='F' where etl_job='" + self.etl_job + "';"
        else:
            sql = "update ETL.ETL_JOB set last_endtime='" + t2 + "',last_jobstatus='D' where etl_job='" + self.etl_job + "';"
        self.exec_sql(sql, 0)
    
    def get_etl_conf_db(self):
        sql = "select etl_system,db_type,map_num,split_key,upper(sc_dbname),upper(sc_tbname),hv_dbname,hv_tbname,usequery,etl_job from ETL.ETL_CONF_DB where etl_job='" + self.etl_job + "';"
        data = self.exec_sql(sql, 1)
        if data is None:
            print "此作业配置不正确,请检查"
            sys.exit(0)
        result = json.dumps({'etl_system': data[0], 'db_type': data[1], 'map_num': data[2], \
                             'split_key': data[3], 'sc_dbname': data[4], 'sc_tbname': data[5], \
                             'hv_dbname': data[6], 'hv_tbname': data[7], 'usequery': data[8], \
                             'etl_job': data[9]})
        return result
    
    def get_hv_tbname(self):
        sql = "select etl_system,hv_dbname,lower(hv_tbname) from ETL.ETL_CONF_DB where etl_job='" + self.etl_job + "';"
        data = self.exec_sql(sql, 1)
        return data[0], data[1], data[2]

    def exec_sql(self, sql, fetch_num=0):
        cur = self.conn.cursor()
        log_cursor = log_handler(self.etl_sys, self.etl_job, self.tx_dt)
        try:
            log_cursor.info(sql)
            cur.execute(sql)
            if fetch_num == 0:
                data = None
            elif fetch_num == 1:
                data = cur.fetchone()
            else:
                data = cur.fetchall()
        except BaseException, e:
            print e
            log_cursor.error(repr(e))
            self.update_etl_job_end(0):
            sys.exit(0)
        cur.close()
        return data
    
if __name__ == '__main__':
    db = mysql_db('ODS', 'test', '20171110', 'ODS')
    print db.get_jobs()
