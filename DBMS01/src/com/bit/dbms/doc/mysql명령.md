# mysql shell 명령

* show : 보기, 확인 
* show databases : Database 목록 확인
* use database : database를 사용하기 위해 접속
* show tables : database에 저장된 table 목록 확인



# Database 생성
### CREATE DATABASE bitdb

# Table 생성
### CREATE TABLE addrbook 

- create table addrbook ( // addrbook 테이블을 만들겠다
-    -> name varchar(10), // name field를 varchar 10글자 크기로 지정
-    -> tel varchar(15), // tel field를 varchar 15글자 크기로 지정
-    -> addr varchar(50), // addr field를 varchar(50)글자 크기로 지정
-    -> age int(5) // age field 정수 5자리크기로 지정
-    -> ) ;
    
 # Table 구조 확인
 
## describe addrbook ;
## show create table addrbook ;


# 데이터 추가

## 전체 field에 맞추어 데이터를 추가
* insert addrbook values('홍길동','001','광주광역시',30) ;

### 필드 목록이 없으면 개별 field만 추가 안됨
* insert addrbook values('이몽룡') ;

### 필드 목록을 지정하여 추가
* insert addrbook(name) values('이몽룡'); // 이름만 추가
* insert addrbook(name,age) value('성춘향',16); // 이름과 나이만 추가


# 데이터 조회, 열람
## 전체 field를 열람
* select * from addrbook ;

## 필요 field만 열람
* select name from addrbook ;
* select name,age from addrbook;

## 조건 검색 열람
* select * from addrbook where name='홍길동' ;
* select * from addrbook where age=16 ;
* select * from addrbook where age >= 16 ;
* select * from addrbook where name='홍길동' and age = 30 ;
* select * from addrbook where age < 16 or age > 30 ;
* select * from addrbook where addr='광주광역시' or addr = '서울' ;

# 데이터 수정(업데이트)
* UPDATE addrbook SET tel = '002' WHERE name = '홍길동' ;
* ※ UDATE에서 조건을 생략하지 말것 !!

* UPDATE addrbook SET tel = '002',addr='남원' , age=19  WHERE name = '이몽룡' ;


# 데이터 삭제
* DELETE FROM addrbook WHERE name = '성충한' ;
* ※ DELETE에서 조건을 생략하지 말것 !!

