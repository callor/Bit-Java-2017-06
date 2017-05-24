CREATE TABLE student (
  
	id int NOT NULL auto_increment, -- 자동증가 PK
	stnum varchar(10) NOT NULL,
	stname varchar(15) NOT NULL,
	stclass int NOT NULL,
	stmajor varchar(10) NOT NULL,
	PRIMARY KEY (id)
);

SELECT * FROM student ;

INSERT INTo student values(
	0,
	"20170101",
	"홍길동",
	"1",
	"컴퓨터공학"
	)