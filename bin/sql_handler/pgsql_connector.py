# coding=utf-8

import time
import psycopg2
import pgsql_config
import sys
import os
from log_handler.log_handler import log_handler

def get_conn():
    return psycopg2.connect(
               host = pgsql_config.host,
               port = pgsql_config.port,
               user = pgsql_config.user,
               password = pgsql_config.passwd,
               database = pgsql_config.database)

def get_meta_col(hv_tbname, etl_system, t, d):
    conn = get_conn()
    with conn:
        cur = conn.cursor()
        sql = "select upper(column_name_en),'CAST('||SOURCE_LOLUMNS||' as '||style_name||')' as col_type \
from (select column_name_en,case when upper(style_name) like 'STRING%' or \
upper(style_name) like 'VARCHAR%' then 'case when trim(`'||source_columns||'`)='''' \
then NULL else `'||source_columns||'` end' else '`'||source_columns||'`'end as SOURCE_LOLUMNS,\
style_name from public.v_column_info_custom_001 where lower(trim(table_name_en))='" + \
hv_tbname + "' ) t"
        log_cursor = pgsql_log(etl_system, t, d)
        try:
            log_cursor.info(sql)
            cur.execute(sql)
            col_num = cur.rowcount
            all_col = cur.fetchall()
        except BaseException, e:
            print e
            log_cursor.error(repr(e))
            sys.exit(0)
    cols = {}
    for i in all_col:
        cols[i[0]] = i[1]
    return cols, col_num
