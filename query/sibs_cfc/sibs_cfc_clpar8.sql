select
lp8col,
lp8cat,
lp8sec,
lp8exm,
lp8ccb,
lp8fct,
lp8hol,
CAST(CAST( lp8des AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as lp8des,
lp8rwt,
lp8cls,
lp8boa,
lp8bai,
lp8mtm,
lp8typ,
CAST(CAST( lp8cnm AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as lp8cnm
from  CMPDPRM.CLPAR8 where $CONDITIONS
