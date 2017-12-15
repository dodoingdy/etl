select
p20cod,
p2iccd,
CAST(CAST( p2icds  AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as p2icds,
p20drc,
p2iclv,
p2hglv
from  RDPDPRM.DDPAR21  where  $CONDITIONS
