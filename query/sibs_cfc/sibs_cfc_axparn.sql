select axnexc,  CAST(CAST( axndsc AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as axndsc,
axnscd,
axnmid,
axndt6,
axndt7,
axnmtm,
axnmws,
axncid,
axncd6,
axncd7,
axnctm,
axncws
   from   AXPDPRM.AXPARN   where $CONDITIONS
