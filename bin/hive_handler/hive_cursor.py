#coding = utf-8

import pyhs2
import os
import re
import time
import sys
import click
import threading
import multiprocessing
from log_handler.log_handler import log_handler

class hive_handler():
    conn = None
    etl_sys = None
    etl_job = None
    tx_dt = None

    def __init__(self, etl_sys, etl_job, tx_dt):
        self.conn = pyhs2.connect(host='localhost',
                                  port=14000,
                                  authMechanism="PLAIN",
                                  user='root',
                                  password='test')
        self.etl_sys = etl_sys
        self.etl_job = etl_job
        self.tx_dt = tx_dt

    def check_htb_exist(self, tb):
        cur = self.conn.cursor()
        sql = 'drop table if exists ' + tb
        log_cursor = log_handler(self.etl_sys, self.etl_job, self.tx_dt)
        try:
            log_cursor.info(sql)
            cur.execute(sql)
        except pyhs2.error.Pyhs2Exception,tx:
            print tx
            log_cursor.error(tx)
            cur.close()
            sys.exit(0)
        cur.close()
    
    def desc_tb(self, tb):
        cur = self.conn.cursor()
        sql = 'desc ' + tb
        log_cursor = log_handler(self.etl_sys, self.etl_job, self.tx_dt)
        try:
            log_cursor.info(sql)
            cur.execute(sql)
            all_cols = cur.fetchall()
        except pyhs2.error.Pyhs2Exception,tx:
            print tx
            cur.close()
            log_cursor.error(tx)
            sys.exit(0)
        cols = []
        cols_num = 0
        for i in all_cols:
            cols.append(i[0].upper())
            cols_num += 1
            if i[0] == 'tx_dt':
                break
        cur.close()
        return cols, cols_num
    
    def tmp2stg(self, cols, hv_tbname):
        cur = self.conn.cursor()
        d = self.tx_dt
        tx_dt = d[:4] + '-' + d[4:6] + '-' + d[6:]
        tb = self.etl_job + '_' + d
        sql = 'insert overwrite table ' + hv_tbname + " partition(TX_DT='" + \
               tx_dt + "') select " + cols + " from tmp." + tb
        log_cursor = log_handler(self.etl_sys, self.etl_job, self.tx_dt)
        try:
            log_cursor.info(sql)
            cur.execute(sql)
        except pyhs2.error.Pyhs2Exception,tx:
            print tx
            log_cursor.error(tx)
            cur.close()
            sys.exit(0)
        cur.close()

    def __del__(self):
        self.conn.close()
