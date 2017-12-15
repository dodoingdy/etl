select cfrisk,  CAST(CAST( cfrisd AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as cfrisd ,cfhigh  from   BWS1PRM.CFRSKL    where $CONDITIONS 
