select
cfcppc,
CAST(CAST( cfcipd AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as cfcipd,
cfccus
from BWPDPRM.CFCPVP    where $CONDITIONS
