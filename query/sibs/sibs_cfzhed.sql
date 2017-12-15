select cfhecd,  CAST(CAST( cfhesc AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as cfhesc  from   BWS1PRM.CFZHED     where $CONDITIONS
