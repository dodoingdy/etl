select
tlstcd,
CAST(CAST( tlndes AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as tlndes,
tlssds,
tlrsds,
tlreds,
tlsec,
tlsmne,
tlsscd,
tlsrsd,
tlsaty,
tlssrc,
tlsfpy,
tlstsi,
tlstnc,
tlsorf,
tlsyrf,
tlstxt,
tltype
from  RDPDPRM.TLUSTM  where  $CONDITIONS
