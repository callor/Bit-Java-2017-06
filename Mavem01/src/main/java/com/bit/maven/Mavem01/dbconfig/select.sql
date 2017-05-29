SELECT count(*) FROM buyer ; -- 레코드 전체 개수확인

-- 코드가 3으로 시작되는 데이터 레코드 개수
SELECT count(*) FROM buyer WHERE bucode LIKE "3%" 

SELECT * FROM sales ;

-- 속도가 중요한 부분에서는 가급적
-- SELECT에서 필드명을 명시하는 것이 좋다.
SELECT sadate, satime, sabucode FROM sales ;

SELECT sadate,satime,sabucode, buname FROM sales
		LEFT JOIN buyer
		ON sales.sabucode = buyer.bucode ;
		
SELECT * FROM sales,buyer ;