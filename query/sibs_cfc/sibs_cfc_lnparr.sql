select 
carcod,
CAST(CAST( cardsc AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as cardsc,
carnrv,
carnpl,
carday
from  CMPDPRM.LNPARR where  $CONDITIONS
