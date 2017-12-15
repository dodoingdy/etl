select
p20cod,
CAST(CAST( p20des  AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as p20des,
p20drc,
siuser,
siwork,
sidat8,
sitime
from  RDPDPRM.DDPAR20  where $CONDITIONS
