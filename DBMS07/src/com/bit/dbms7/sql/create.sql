-- 고객관리 테이블 생성
CREATE TABLE buyer (
	id int NOT NULL auto_increment,
	bunum varchar(10) NOT NULL,
	buname varchar(15) NOT NULL,
	butel varchar(15) NOT NULL,
	buaddr varchar(50) DEFAULT "우리동네",
	bupoint int DEFAULT 0,
	PRIMARY KEY(id)
);

DROP TABLE buyer;

-- 상품판매 테이블 생성
CREATE TABLE sale (

	id int NOT NULL auto_increment,
	sadate varchar(8) NOT NULL,
	satime varchar(8) NOT NULL,
	sabunum varchar(10),
	sapcode varchar(13), -- 상품 바코드
	sapprice int, -- 상품가격
	sapqty int, -- 개수
	saptotal int, -- 합계(상품가격 * 개수)
	sapoint int, -- 포인트
	
	PRIMARY KEY(id)

);

-- 상품테이블
CREATE TABLE product (

	id int NOT NULL auto_increment,
	pcocde varchar(13) NOT NULL,
	pname varchar(25) NOT NULL,
	pdcode varchar(5) NOT NULL, -- 공곱처코드
	pmcode varchar(5) NOT NULL, -- 품목코드
	ppcode varchar(5), 
	piprice int, -- 매입가격
	poprice int, -- 판매가격
	
	PRIMARY KEY(id)

);


