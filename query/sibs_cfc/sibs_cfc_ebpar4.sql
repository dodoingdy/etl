select
e4ctyp,
CAST(CAST( e4desc  AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as e4desc,
e4pmod,
e4mcnt,
e4mina,
e4maxa,
e4cvip,
e4cinv,
e4dacc,
e4pasb,
e4genm
from   EBPDPRM.EBPAR4  where  $CONDITIONS
