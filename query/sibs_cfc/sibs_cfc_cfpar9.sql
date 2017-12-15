select
cp9cou,
cp9cty,
cp9acd,
cp9seq,
CAST(CAST( cp9dsc AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as cp9dsc,
cp9cod,
cp9ind,
cp9zip
from BWPDPRM.CFPAR9  where $CONDITIONS
