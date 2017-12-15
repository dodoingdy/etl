select
jhccoc,
CAST(CAST( jhcnam  AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as jhcnam,
jhcsub,
jhctxt,
jhczon,
jhcmon,
jhctue,
jhcwed,
jhcthu,
jhcfri,
jhcsat,
jhcsun,
jhcccd,
jhcdec,
jhcdsc,
jhcitc
from  SSPDPRM.JHCOUN   where  $CONDITIONS
