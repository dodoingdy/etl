select
gleabr,
glecur,
glefcr,
gleagp,
gleasq,
gleaac,
gleal1,
gleal2,
gleal3,
CAST(CAST( gleatt  AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as gleatt,
gleabl
from  GLPDDATD.GLEMAK  where  $CONDITIONS
