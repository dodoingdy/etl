select
g3tran,
g3dorc,
g3afft,
CAST(CAST( g3desc  AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as g3desc
from  GLPDPRM.GLPAR3  where  $CONDITIONS
