select cfzucd,  CAST(CAST( cfzusc AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as cfzusc,cfzuty,cfzuml,cfamnt  from   BWS1PRM.CFZUSG  where $CONDITIONS 
