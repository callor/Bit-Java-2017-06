-- 고객정보 등록
INSERT INTO buyer values (
	0,
	"8085",
	"홍길동",
	"010-9652-8085",
	"우리집",
	0
);

--	id int NOT NULL auto_increment,
--	sadate varchar(8) NOT NULL,
--	satime varchar(8) NOT NULL,
--	sabunum varchar(10),
--	sapcode varchar(13), -- 상품 바코드
--	sapprice int, -- 상품가격
--	sapqty int, -- 개수
--	saptotal int, -- 합계(상품가격 * 개수)
--	sapoint int, -- 포인트

INSERT INTO sale values(
   0,
   "20170525",
   "115000",
   "8085",
   "880025",
   1200,
   2,
   1500*2,
   (1500*2)*0.05
);

INSERT INTO sale values(
   0,
   "20170525",
   "115100",
   "8085",
   "880031",
   2000,
   3,
   2000*3,
   (2000*3)*0.05
);

INSERT INTO sale values(
   0,
   "20170525",
   "115900",
   "8085",
   "880041",
   2100,
   1,
   2100*1,
   (2100*1)*0.05
);

--	id int NOT NULL auto_increment,
--	pcocde varchar(13) NOT NULL,
--	pname varchar(25) NOT NULL,
--	pdcode varchar(5) NOT NULL, -- 공곱처코드
--	pmcode varchar(5) NOT NULL, -- 품목코드
--	ppcode varchar(5), 
--	piprice int, -- 매입가격
--	poprice int, -- 판매가격

INSERT INTO product values(
  0,
	"880025",
	"맥심커피",
	"0001",
	"0001",
	"0001",
	1000,
	1200
);
INSERT INTO product values(
  0,
	"880031",
	"블랙커피",
	"0001",
	"0001",
	"0001",
	1800,
	2000
);
INSERT INTO product values(
  0,
	"880041",
	"현미녹차",
	"0001",
	"0001",
	"0001",
	1900,
	2100
);

