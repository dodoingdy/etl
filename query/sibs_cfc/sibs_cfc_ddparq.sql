select
qbtype,
qbgrop,
CAST(CAST( qbsdes  AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as qbsdes,
CAST(CAST( qbdesc  AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as qbdesc,
qbrept,
qblmct,
qbapcd,
qfill1,
qfill2,
datype,
dctype,
dcurcd,
dappvc,
daddnm,
ddormt,
ddormf,
dlowmf,
ddupck,
ddvera 
from  RDPDPRM.DDPARQ  where  $CONDITIONS