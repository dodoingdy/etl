select
jfxbnk,
jfxcod,
jfxdec,
jfxcvf,
jfxrnd,
jfxcun,
CAST(CAST( jfxdsc AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as jfxdsc,
jfxund,
jfxfrd,
jfxcnc,
jfxitc,
jfxbkc,
jfxmjr,
jfxsup,
jfxbrt,
jfxsrt,
jfxmrt,
jfxart,
jfxort,
jfxrt6,
jfxrt7,
jfxrt8,
jfxrt9,
jfxrt10,
jfxrt11,
jfxsbrt,
jfxssrt,
jfxsmrt,
jfxsart,
jfxsort,
jfxsrt6,
jfxsrt7,
jfxsrt8,
jfxsrt9,
jfxsrt10,
jfxsrt11,
jfxlbrt,
jfxlsrt,
jfxlmrt,
jfxlart,
jfxlort,
jfxlrt6,
jfxlrt7,
jfxlrt8,
jfxlrt9,
jfxlrt10,
jfxlrt11,
jfxmd7,
jfxmd6,
jfxtime,
jfxwork,
jfxsper,
jfxpgm,
jsrmd7,
jsrmd6,
jsrtime,
jsrwork,
jsrsper,
jsrpgm,
jfhirt,
jflort,
jftime
from  SSPDPRM.JHFXRT  where  $CONDITIONS