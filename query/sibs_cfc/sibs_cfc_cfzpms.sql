select
cfmstc,
CAST(CAST( cfmstd AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as cfmstd
from  BWPDPRM.CFZPMS  where $CONDITIONS

