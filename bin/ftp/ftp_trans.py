#coding = utf-8

from gevent import monkey
monkey.patch_all()
import gevent
import pyhs2
from ftplib import FTP
import os
import re
import time
import sys
import click
import ftp_conf
import threading
from multiprocessing import Process
from hive_cursor import GetHivecur, hive_log, hdfs_log, hdfs_put 

def ftp_log(filet, from_host):
    logfile = ftp_conf.logfile
    file = open(logfile, 'a')
    time_now = time.localtime(time.time())
    now = time.strftime('%Y%m%d-%H:%M:%S', time_now)
    log = now + ' ' + filet + ' to be transfered by ftp from' + from_host + '\n'
    file.write(log)
    file.close()

def file_write(fn):
    print 'start ' + fn
    f = FTP(ftp_conf.server)
    f.login('root', 'putty#123')
    f.cwd(ftp_conf.ftp_path)
    directory = ftp_conf.file_path
    loc =  open(directory + fn , 'wb')
    f.retrbinary('RETR ' + fn, loc.write)
    loc.close()
    f.quit()
    print 'end ' + fn

def get_files(files):
    for i in files:
        tasks.append(gevent.spawn(file_write,i))
    gevent.joinall(tasks)

def ftp_file_trans():
    timer = threading.Timer(60, ftp_file_trans)
    timer.start()
    f = FTP(ftp_conf.server)
    f.login('root', 'putty#123')
    f.cwd(ftp_conf.ftp_path)
    ftpfilelist = f.nlst()
    f.quit()
    
    tasks = []
    if 'file.fnsh' in ftpfilelist:
        for i in ftp_conf.file_list:
            tasks.append(gevent.spawn(file_write, i))
        gevent.joinall(tasks)

def load():
    hive_tables = []
    for j in ftp_conf.file_list:
        r_m = re.match(r'(.*)\.(.*)', j, re.M|re.I)
        if r_m:
            f_name = r_m.group(1)
        else:
            f_name = j
        hive_tables.append(f_name)
        hdfs_order = 'hdfs dfs -put ' + ftp_conf.file_path + j + ' ' + f_name
        print hdfs_order
        os.system(hdfs_order)

    for i in hive_tables:
        hdfs_log(i)

    hive_sqls = []
    tasks = []
    for j in hive_tables:
        sql = 'create table if not exists' + j + ' like sddl.' + j
        hive_sqls.append(sql)
        sql = "load data inpath '" + j + "' overwrite into table " + j
        hive_sqls.append(sql)
    cursor = GetHivecur()
    for i in hive_sqls:
        run_select(cursor, i)

def do_test():
    timer = threading.Timer(2, do_test)
    timer.start()
    print 'lueluelue'

def main():
    ftp_file_trans()

if __name__ == '__main__':
    main()
