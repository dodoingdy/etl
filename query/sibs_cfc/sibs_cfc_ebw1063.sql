select
weccard,
weccif,
CAST(CAST( wecshnm  AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as wecshnm,
wecctyp,
wecacno,
wecatyp,
weccate,
wechotr,
wecopid,
wecdtis,
weccsts,
wectrxc,
wecbank,
wecissb,
wdinfrc,
windtor,
wcrdrep,
wecaccu
from  EBPDDATD.EBW1063  where  $CONDITIONS
