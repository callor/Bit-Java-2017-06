DROP TABLE buyer;

-- 고객정보 저장 Table
CREATE TABLE buyer (
	id int NOT NULL auto_increment,
	bucode varchar(10) NOT NULL , -- 고객코드
	buname varchar(15) NOT NULL, -- 고객이름
	butel varchar(15) NOT NULL, -- 전화번호
	buaddr varchar(50) DEFAULT "우리동네", -- 주소
	bupoint int DEFAULT 0, -- 포인트
	PRIMARY KEY(id)
);
