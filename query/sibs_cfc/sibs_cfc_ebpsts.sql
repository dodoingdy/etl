select
eschid,
esstsc,
esrscd,
CAST(CAST( esdesc  AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as esdesc,
esract,
esriss
from  EBPDPRM.EBPSTS  where  $CONDITIONS 
