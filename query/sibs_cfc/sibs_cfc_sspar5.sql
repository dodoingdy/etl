select
cicode,
cicatg,
CAST(CAST( ciname AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as ciname,
cientc,
cirevc,
ciauto,
ciavlb,
ciaday,
cifday,
cictim,
ciafft
cimode,
cialmn,
ci5bop,
citext,
cirond,
ciregn
from   SSPDPRM.SSPAR5  where $CONDITIONS
