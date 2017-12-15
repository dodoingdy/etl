select cfzcor,  CAST(CAST( cfzcsd AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as cfzcsd  from   BWS1PRM.CFZPCR    where $CONDITIONS 
