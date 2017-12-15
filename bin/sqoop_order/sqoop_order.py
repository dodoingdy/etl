#coding=utf-8

import commands
import re
import time
import click
import rsa
import gevent
import os

def order_without_sql(data, db_type):
    map_num = data['map_num'].__repr__()
    etl_sys = data['etl_system']
    sc_tb = data['sc_tbname']
    sc_db = data['sc_dbname']
    if sc_db:
        sc_tb = sc_db + '.' + sc_tb
    htb = data['etl_job']
    with open('../etc/' + etl_sys.upper() + '.etc', 'r') as f:
        conf = []
        for i in f:
            conf.append(i[:-1])
    with open('../docs/private.pem','r') as f:
        privkey = rsa.PrivateKey.load_pkcs1(f.read().encode())
    password = rsa.decrypt(conf[2], privkey).decode()

    order = "sqoop import  --hive-import --connect " + conf[0] + " --username " + conf[1] + " --password " + password + " -m " + map_num + " --table " + sc_tb + " --fields-terminated-by '\\t' --null-string '\\\\N' --null-non-string '\\\\N' --hive-import --hive-overwrite  --hive-database TMP --hive-table " + htb + "  --delete-target-dir  --outdir " + conf[3]
    if db_type == "ORA":
        order = order + " --direct"
    else:
        order = order + " --hive-drop-import-delims"
    if map_num != 1:
        order = order + " --split-by RRN\\(" + sc_tb + "\\)"
    return order

def order_with_sql(data, db_type):
    m = data['map_num'].__repr__()
    etl_sys = data['etl_system']
    sc_tb = data['sc_tbname']
    sc_db = data['sc_dbname']
    if sc_db:
        sc_tb = sc_db + '.' + sc_tb
    htb = data['etl_job']
    with open('../etc/' + etl_sys.upper() + '.etc', 'r') as f:
        conf = []
        for i in f:
            conf.append(i[:-1])
    with open('../docs/private.pem','r') as f:
        privkey = rsa.PrivateKey.load_pkcs1(f.read().encode())
    password = rsa.decrypt(conf[2], privkey).decode()
    target_dir = '/usr/hive/warehouse/time_test.db/' + htb
    file_path = "../query/" + etl_sys.lower() + "/" + htb.lower() + ".sql"
    with open(file_path,"r") as query_file:
        query = query_file.read()
        query = query[:-1]
    order = "sqoop import  --hive-import --connect " + conf[0] + " --username " + conf[1] + " --password " + password + " -m " + map_num + " --query '" + query + "' --target-dir " + target_dir + " --fields-terminated-by '\\t' --null-string '\\\\N' --null-non-string '\\\\N' --hive-import --hive-overwrite  --hive-database TMP --hive-table " + htb + "  --delete-target-dir --hive-drop-import-delims --outdir " + conf[3]
    if db_type == "ORA":
        order = order + " --direct"
    if map_num != 1:
        order = order + " --split-by RRN\\(" + sc_tb + "\\)"
    return order

def read_tables():
    oracle_table = []
    file = open('tb.txt')
    while True:
        line = file.readline()
        if not line:
            break
        oracle_table.append(line[:-1])
    return oracle_table
