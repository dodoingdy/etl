select
oblrsk,
CAST(CAST( obldsc AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as obldsc,
c9wkst,
c9user,
c9dat7,
c9dat6,
c9time
from  BWPDPRM.CFZPOB where $CONDITIONS
