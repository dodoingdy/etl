select
c3tran,
c3dorc,
c3afft,
c3safc,
CAST(CAST( c3desc AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as c3desc,
c3adlt,
c3ectx,
c3anmp,
c3pseq,
c3gst,
c3faf5,
c3faf6,
c3faf7,
c3faf8,
c3faf9,
c3fafa,
c3fafb,
c3fafc,
c3fafd,
c3fafe
from   RDPDPRM.CDPAR3    where $CONDITIONS
