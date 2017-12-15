#!/usr/bin/python
# coding=utf-8

from sql_handler.mysql_connector import mysql_db
import click
from hive_handler.hive_cursor import hive_handler
from sql_handler.pgsql_connector import get_meta_col
from log_handler.log_handler import log_handler
import sys
import time

@click.command()
@click.option('--t', help='ETL_JOB')
@click.option('--d', help='TX_DATE')
@click.option('--s', help='ETL_SYS')
@click.option('--id', help='JOB_ID')
def load(t, d, s, id):
    if not (t and d and s):
        print ('参数不符合规范，请检查参数')
        return 0
    print '开始字段校验...'
    hive_cur = hive_handler()
    mysql_db = mysql_db()
    etl_system, hv_dbname, hv_tbname = mysql_db.get_hv_tbname(t, d, s)
    tb = 'STG.' + hv_tbname
    hv_cols, hv_cols_num = hive_cur.desc_tb(tb, etl_system, t, d)
    meta_cols, meta_cols_num = get_meta_col(hv_tbname, etl_system, t, d)
    if hv_cols_num != meta_cols_num:
        print '行数不一致'
        return 0
    columns = check_cols(hv_cols, meta_cols, etl_system, t, d, id)
    print hive_cur.tmp2stg(columns, tb, t, d, etl_system)

def check_cols(hv_cols, meta_cols, etl_sys, t, d, id):
    result = []
    log_cursor = log_handler(etl_sys, t, d, id)
    for i in hv_cols:
        try:
            result.append(meta_cols[i])
        except BaseException, e:
            print e
            log_cursor.error(e)
            sys.exit(0)
    print len(result)
    result.pop()
    return ",".join(result)

if __name__ == '__main__':
    load()
