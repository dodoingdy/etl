# coding=utf-8

import click
import commands
from extr_db import check_db, run_orders, run_order
import re
import os
import gc # for test

@click.command()
@click.option('--t', help='ETL_JOB')
@click.option('--d', help='TX_DATE')
@click.option('--s', help='ETL_SYS')
def main(t, d, s):
    if not (t and d and s):
        print "参数不符合规范，请检查参数"
        return -1
    elif not re.match(r'\d{8}', d):
        print "日期参数不符合规范,应为YYYYMMDD格式"
        return -1
    else:
        for i in read_all_files():
            order = "python " + i + " --s " + s + " --t " + t + " --d " + d
            print order
            os.system(order)

def read_all_files():
    path = "../APP/TEST/JOB_TEST/"
    files = os.listdir(path)
    result = []
    for i in files:
        (shotname, extension) = os.path.splitext(i)
        if extension != '.bak':
            result.append(path + i)
    return sorted(result)

if __name__ == '__main__':
    main()
