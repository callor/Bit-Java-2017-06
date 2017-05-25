SELECT * FROM buyer ;

SELECT * FROM sale ;
		// sale buyer
SELECT sadate, satime,  
	sapcode,pname,sapprice,sapqty,saptotal,
	sabunum, buname

	FROM sale 
	LEFT JOIN buyer
		ON sale.sabunum = buyer.bunum
	LEFT JOIN product
		ON sale.sapcode = product.pcocde
;