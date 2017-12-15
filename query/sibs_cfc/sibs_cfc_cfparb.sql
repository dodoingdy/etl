select
cfbopn,
CAST(CAST( cfbopd AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as cfbopd,
cfbtyp,
cftrade,
cfctrx,
cffil1,
cffil2,
cffil3
from SSPDPRM.CFPARB where $CONDITIONS
