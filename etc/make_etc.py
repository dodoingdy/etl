# coding=utf-8

import rsa
import re
import sys
sys.path.append('../../')
from etl.docs.rsa_encrypt import encrypt_key

def main():
    # driver = 'com.ibm.as400.access.AS400JDBCDriver'
    conn = 'jdbc:oracle:thin:@10.1.81.56:1521/OPICS'
    user = 'OPICSODS'
    message = 'MASTER'
    crypto = encrypt_key(message)
    outdir = '/home/dingyi/etl/sqoop_java'
    result = []
    # result.append(driver)
    result.append(conn)
    result.append(user)
    result.append(crypto)
    result.append(outdir)
    with open('dodoing.etc', 'w') as f:
        for i in result:
            f.write(i)
            f.write('\n')

if __name__ == '__main__':
    main()
