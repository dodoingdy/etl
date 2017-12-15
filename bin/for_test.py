#!/usr/bin/python
#coding=utf-8

import os
import commands
import re

lista = [
'--t SIBS_CFGOVB --d 20171110 --s 400',
'--t SIBS_CFPAR2 --d 20171110 --s 400',
'--t SIBS_CFPAR5 --d 20171110 --s 400',
'--t SIBS_CFRSKL --d 20171110 --s 400',
'--t SIBS_CFSICC --d 20171110 --s 400',
'--t SIBS_CFZBLS --d 20171110 --s 400',
'--t SIBS_CFZFCT --d 20171110 --s 400',
'--t SIBS_CFZFCY --d 20171110 --s 400',
'--t SIBS_CFZHED --d 20171110 --s 400',
'--t SIBS_CFZPAF --d 20171110 --s 400',
'--t SIBS_CFZPCR --d 20171110 --s 400',
'--t SIBS_CFZPIT --d 20171110 --s 400',
'--t SIBS_CFZPRO --d 20171110 --s 400',
'--t SIBS_CFZUSG --d 20171110 --s 400',
'--t SIBS_JHMAIL --d 20171110 --s 400',
]

err_tables = []
for i in lista:
    order = 'python std_load.py ' + i
    os.system(order)
    status, output = commands.getstatusoutput(order) 
    lines = output 
    print lines
    lines = re.split('\n', lines) 
    judge = 0 
    for j in lines: 
        if re.match(r".*INFO  \[main\] hive.HiveImport: Hive import complete.*", j): 
            judge = 1 
            break 
    if judge:
        err_tables.append(i)

if err_tables:
    for i in err_tables:
        print 'error accured with table ' + i
