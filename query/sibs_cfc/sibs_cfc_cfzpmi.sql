select
mascod,
CAST(CAST( masdsc AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as masdsc,
masids,
masid2,
masid3,
masid4,
c9wkst,
c9user,
c9dat7,
c9dat6,
c9time,
cfhric,
massys
from  BWPDPRM.CFZPMI  where $CONDITIONS

