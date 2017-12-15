select cfprcd,  CAST(CAST( cfprsc AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as cfprsc  from   BWS1PRM.CFZPRO   where $CONDITIONS 
