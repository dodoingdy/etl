select
cfzedl,
CAST(CAST( cfzedd AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as cfzedd
from BWPDPRM.CFZPEL where $CONDITIONS
