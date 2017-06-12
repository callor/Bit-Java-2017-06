SELECT datediff('2017-03-31','2017-03-01')
SELECT month('2017-03-01') -- 월만 뽑아내기
SELECT month('2017-03-31') - month('2017-01-01')
SELECt month('2017-04-01') - month('2017-01-01')

SELECT DATE_FORMAT(curdate(),'%Y-%m-%d') -- 문자열로 변환
SELECT DATE_FORMAT(curdate(),"%y-%m-%d") -- 17-06-12
curtime()

SELECT '2017-01-01' + INTERVAL 1 DAY

SELECT DAYOFMONTH(curdate()) -- 날짜값만 뽑아내기
SELECT dayname(curdate()) -- 요일을 영어로
SELECT dayofweek(curdate()) -- 요일 숫자
SELECT dayofyear(curdate()) -- 오늘이 1월 1일 이후 몇일째인지
SELECT dayofyear('2017-06-01') -- 6월 1일이 몇일째인지
SELECT PERIOD_DIFF('201703','201701') -- 몇개월 차이인가
SELECT quarter(curdate()) -- 몇번째 분기인가(1-4까지)