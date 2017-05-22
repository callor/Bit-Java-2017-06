# PRIMARY KEY

## 데이터베이스에서 Record의 유일함을 보장하기 위한
## 식별자 필드

## ID 필드 : PK
### NOT NULL, AUTO_INCREMENT 
### 반드시 값이 입력되어야 하고, 자동 증가필드로 설정
* create table addrbook (
*    ID int(10) NOT NULL AUTO_INCREMENT,
*    name varchar(15) NOT NULL,
*    tel varchar(15),
*    addr varchar(50),
*    age int,
*    PRIMARY KEY (ID)
* ) ;

### PRIMARY KEY 명령 설정
