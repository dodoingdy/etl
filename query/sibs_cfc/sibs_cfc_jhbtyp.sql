select
ctycod,
CAST(CAST( ctyds1  AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as ctyds1,
ctyind
from  SSPDPRM.JHBTYP  where  $CONDITIONS

