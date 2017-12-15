select
jhccod,
CAST(CAST( jhcdes  AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as jhcdes,
jhclid,
jhcinv,
jhmajc
from  SSPDPRM.JHCLAS  where  $CONDITIONS
