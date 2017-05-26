SELECT * FROM names ;

DELETE FROM names ; -- 응급시 복구가능
TRUNCATE buyer ;   -- 복구 불가능

SELECT * FROM buyer ;
SELECT count(*) FROM buyer ; -- 레코드 개수 확인

SELECT count(*) FROM buyer WHERE bucode > 5000 ;
-- 5000 번 이상
SELECT bucode FROM buyer WHERE bucode > 5000;

-- 2001 부터 4999까지 범위
SELECT bucode FROM buyer WHERE bucode > 2000 and bucode < 5000 ;

-- 2000 부터 5000까지
SELECT bucode FROM buyer WHERE bucode >= 2000 and bucode =< 5000 ;
SELECT bucode FROM buyer WHERE  bucode between 2000 and 5000 ;

SELECT sum(bupoint) FROM buyer ;

-- 중간문자열 검색, DB 성능저하
SELECT * FROM buyer WHERE bucode LIKE "34%" ;
-- 34가 코드에 포함된 사람들
SELECT * FROM buyer WHERE bucode LIKE "%34%" ;


-- bucode 로 묶어서 보여달라
-- 같은 코드가 있으면 1개로 보여준다
SELECT bucode FROM buyer GROUP BY bucode;
SELECT count(*) FROM buyer GROUP BY bucode ; 
SELECT count(*) FROM buyer GROUP BY bucode HAVING count(*) > 1 ;
SELECT bucode FROM buyer GROUP BY bucode HAVING count(*) > 1 ;
SELECT * FROM buyer WHERE bucode = "6272";

SELECT bucode,buname FROM buyer GROUP BY bucode,buname ;

-- 전체 중에 10개의 데이터만 List
SELECT * FROM BUYER LIMIT 10 ;

-- 전체 중에 10번째 부터 30번째까지만 List
SELECT * FROM BUYER LIMIT 10, 30 ;

-- bucode를 기준으로 오름차순 정렬
SELECT * FROM buyer ORDER BY bucode LIMIT 10 ;
-- bucode를 기준으로 내림차순 정렬
SELECT * FROM buyer ORDER BY bucode DESC LIMIT 10;

-- buname순으로 내림차순 정렬한 후, bucode로 오름차순 정렬하라
SELECT * FROM buyer ORDER BY buname DESC, bucode LIMIT 10 ;
SELECT * FROM buyer ORDER BY buname DESC, bucode LIMIT 11,20 ;
SELECT * FROM buyer ORDER BY buname DESC, bucode LIMIT 21,30 ;
SELECT * FROM buyer ORDER BY buname DESC, bucode LIMIT 31,40 ;
SELECT * FROM buyer ORDER BY buname DESC, bucode LIMIT 41,50 ;
SELECT count(*) FROM buyer ;



