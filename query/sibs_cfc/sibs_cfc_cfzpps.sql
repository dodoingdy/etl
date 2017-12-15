select
stsnum,
stscod,
CAST(CAST( stsmne AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as stsmne,
CAST(CAST( stsdsc AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as stsdsc,
crdtrx,
dbttrx,
tagopt,
stsgrp,
rstlns,
c9wkst,
c9user,
c9dat7,
c9dat6,
c9time,
cutype,
stssys
from BWPDPRM.CFZPPS where $CONDITIONS
