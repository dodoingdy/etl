select
cfempc,
CAST(CAST( cfempd AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as cfempd
from  BWPDPRM.CFZPEM  where $CONDITIONS
