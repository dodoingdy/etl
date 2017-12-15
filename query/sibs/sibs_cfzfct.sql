select cfzfty,  CAST(CAST( cfzfds AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as cfzfds ,cfzsys  from   BWS1PRM.CFZFCT    where $CONDITIONS
