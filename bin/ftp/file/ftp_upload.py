#coding = utf-8

from ftplib import FTP
import re
import time

def ftp_link():
    f = FTP('master')
    f.login('root', 'putty#123')
    file = 'test.txt'
    r_m = re.match(r'(.*)\.(.*)', file, re.M|re.I)
    file_name = r_m.group(1)
    file_type = r_m.group(2)
    date = time.strftime('%Y%m%d')
    loc =  open('/home/dingyi/' + file_name, 'rb')
    f.storlines('STOR ' + file, loc)
    loc.close()
    f.quit()

def main():
    ftp_link()

if __name__ == '__main__':
    main()

