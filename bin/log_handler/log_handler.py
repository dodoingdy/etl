#coding=utf-8

import logging
import os

def log_handler(etl_sys, script_name, tx_dt, ID):
    log_dir = '../log/'+ etl_sys + '/' + tx_dt
    if not os.path.exists(log_dir):
        os.makedirs(log_dir)
    logfile = log_dir + '/' + script_name + '_' + ID + '.log'
    logging.basicConfig(filename=logfile,
                       filemode='ab+',
                       level=logging.INFO,
                       format='%(asctime)s %(name)s %(levelname)s %(message)s')
    return logging

def etl_log(etl_sys, etl_job, tx_dt, jobid):
    argv0_list = sys.argv[0].split("/");
    script_name = argv0_list[len(argv0_list) - 1];
    scname = script_name[0:-3]
    log_dir = '../logs/' + etl_sys + '/' + tx_dt
    if not os.path.exists(log_dir):
        os.makedirs(log_dir)
    logfile = log_dir + '/' + scname + '_' + str(jobid) + '.log'
    logging.basicConfig(filename=logfile,
                       filemode='ab+',
                       level=logging.INFO,
                       format='%(asctime)s %(name)s %(levelname)s %(message)s')
    console = logging.StreamHandler()
    console.setLevel(logging.INFO)
    formatter = logging.Formatter('%(asctime)s %(name)s %(levelname)s %(message)s')
    console.setFormatter(formatter)
    logging.getLogger('').addHandler(console)
    global trace_log
    trace_log = logging
    return trace_log
