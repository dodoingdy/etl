#coding=utf-8

import os
import gc
import commands
import re
import time

def read_oracle_t():
    oracle_table = []
    file = open('tb.txt')
    while 1:
        line = file.readline()
        if not line:
            break
        oracle_table.append(line[:-1])
    return oracle_table

def run_orders(tables):
    err_tables = []
    for i in tables:
        r = re.match(r'(.*)\.(.*)', i, re.M|re.I)
        if not r:
            err_tables.append(i)
            continue
        hdatabase = r.group(1)
        htable = r.group(2)
        file_name = htable + ".log"
        file = open(file_name)
        for j in file:
            r = re.match(r".* Transferred (.*) in (.*)econds (.*/sec)", j)
            if r:
                mem = r.group(1)
                timecost = r.group(2)
                continue
            r = re.match(r".* Retrieved (.*) records.", j)
            if r:
                log(i + '\t' + mem + '\t' + timecost + '\t' + r.group(1))
                mem = ''
                timecost = ''
    if err_tables:
        print str(err_tables) + ' is failed!Their name should be database.table!'

def main():
    t1 = time.time()
    oracle_tables = read_oracle_t()
    run_orders(oracle_tables)
    t2 = time.time()
    print 'The time cost is ' + str(t2 - t1)

def log(line):
    logfile = 'sqoop_sum.log'
    file = open(logfile, 'a')
    file.write(line + '\n')
    file.close()

if __name__ == '__main__':
    main()
