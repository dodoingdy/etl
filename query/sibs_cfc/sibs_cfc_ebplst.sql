select
ellnam,
ellitm,
elltrs,
CAST(CAST( elldes  AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as elldes,
ellfil
from  EBPDPRM.EBPLST  where  $CONDITIONS
