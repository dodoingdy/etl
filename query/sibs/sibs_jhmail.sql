select jhmcod,  CAST(CAST( jhmdes AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as jhmdes,
				CAST(CAST( jhmlds AS CHAR(200) CCSID 65535) AS CHAR(40) CCSID 935) as jhmlds,
jhmlid  from   SSS1PRM.JHMAIL  where $CONDITIONS 
