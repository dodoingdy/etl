select
l3tran,
l3dorc,
l3afft,
l3afnp,
l3afar,
l3rtrn,
l3epen,
l3rbal,
l3comt,
CAST(CAST( l3tcds AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as l3tcds,
l3pseq,
l3glif,
CAST(CAST( l3sdsc AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as l3sdsc
from LSPDPRM.LNPAR3  where  $CONDITIONS
