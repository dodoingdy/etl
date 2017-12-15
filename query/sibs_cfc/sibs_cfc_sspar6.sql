select
s6code,
CAST(CAST( s6desc AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as s6desc,
s6user,
s6work,
s6dat6,
s6dat7
s6time,
s6days,
s6dtyp,
s6type
from  SSPDPRM.SSPAR6  where  $CONDITIONS 
