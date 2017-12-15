select
bmcrsn,
CAST(CAST( bmcdsc  AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as bmcdsc,
CAST(CAST( bmcdss  AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as bmcdss,
CAST(CAST( bmctxt  AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as bmctxt,
bmctrc,
bmcchg,
bmcrs2,
bmcdes,
bmcpct
from  SSPDPRM.DDPARC  where  $CONDITIONS
