#coding=utf-8

import base64
import xlrd
import cx_Oracle
import re

ora_conf = {
'conn':'ip:port/db',
'usernm':'usernm',
'passwd':'pw',
}

def ora_conn():
    usernm = ora_conf['usernm']
    passwd = ora_conf['passwd']
    conn = ora_conf['conn']
    db = cx_Oracle.connect(usernm, passwd, conn)
    cur = db.cursor()
    empty_tbs = []
    err_tbs = []
    success_tbs = []
    with open('oracle_tbs.txt') as f: # oracle_tbs is the name of the tables
        for i in f:
            tb_map = {}
            try:
                tb = i[:-1]
                sql = "select count(1) from " + tb
                cur.execute(sql)
                total_col_num = cur.fetchone()
                total_col_num = total_col_num[0]
                if not total_col_num:
                    empty_tbs.append(i)
                    continue
                else:
                    success_tbs.append(i)
                sql = "SELECT COLUMN_NAME FROM user_tab_columns WHERE TABLE_NAME=upper('" + tb + "') order by COLUMN_NAME"
                print sql
                cur.execute(sql)
                result = cur.fetchall()
                for col in result:
                    sql = "select sum(case when " + col[0] + " is null then 1 else 0 end) from " + tb
                    cur.execute(sql)
                    not_empty_col = cur.fetchone()
                    tb_map[col[0]] = not_empty_col[0]
                print tb_map
                with open("empty_rate.txt", 'a') as f:
                    for key, value in enumerate(tb_map):
                        temp = float(tb_map[value])/total_col_num
                        print tb_map[value], total_col_num
                        end = '%s %s %s %s %s\n'%(tb, value, tb_map[value], total_col_num, temp)
                        f.write(end)
                    f.write('\n')
            except BaseException as error:
                err_tbs.append(i)
                print error
    print empty_tbs, err_tbs  # empty_tbs don't have any data, err_tbs failed
    return empty_tbs, err_tbs

if __name__ == '__main__':
    ora_conn()
