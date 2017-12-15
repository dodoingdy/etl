select
sticgr,
sticcd,
CAST(CAST( sticds  AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as sticds,
sticlv,
schglv
from  RDPDPRM.DDPARJ  where  $CONDITIONS  

