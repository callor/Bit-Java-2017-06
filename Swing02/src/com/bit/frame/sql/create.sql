CREATE TABLE member_table (

	id int auto_increment NOT NULL,
	userId varchar(10) NOT NULL,
	userName varchar(20) NOT NULL,
	userPw varchar(125) NOT NULL,
	userSex varchar(10),
	userTel varchar(20),
	
	PRIMARY KEY(id)

);