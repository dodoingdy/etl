select
pc2reci,
pc2appl,
pc2fcod,
CAST(CAST( pc2desc AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as pc2desc,
pc2dlyp,
pc2glac,
pc2re01,
pc2re02,
pc2re03,
pc2re04,
pc2re05,
pc2re06,
pc2crt8,
pc2ctim,
pc2cuid,
pc2cwid,
pc2ldt8,
pc2ltim,
pc2luid,
pc2lwid
from  SSPDPRM.PCPAR2  where  $CONDITIONS

