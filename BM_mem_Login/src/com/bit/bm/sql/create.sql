-- 회원기본정보 Table
DROP TABLE member_table ;
CREATE TABLE member_table (

	id int NOT NULL auto_increment,
	userId varchar(15) NOT NULL,
	userPasswd varchar(32) NOT NULL,
	userName varchar(20) NOT NULL,
	userTel varchar(20),
	userGrade int,
	
	PRIMARY KEY(id)

);

INSERT INTO member_table values( 0,'10-001',md5('1234'),'홍길동','0001',0 );
INSERT INTO member_table values( 0,'10-002',md5('1234'),'이몽룡','0001',1 );
INSERT INTO member_table values( 0,'10-003',md5('1234'),'성춘향','0001',2 );
INSERT INTO member_table values( 0,'10-004',md5('1234'),'장보고','0001',3 );
INSERT INTO member_table values( 0,'10-005',md5('1234'),'장영실','0001',5 );

SELECT * FROm member_table ;
