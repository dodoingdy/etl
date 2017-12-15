select
actycd,
CAST(CAST( actyds  AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as actyds,
accatg,
acopcs,
acwdcs,
acwdlm,
acwdsc
from  RDPDPRM.DDPARE   where  $CONDITIONS  
