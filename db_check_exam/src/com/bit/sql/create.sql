-- DROP book_table ;

Create table book_table(
	
	id int not null auto_increment,
	bookCode varchar(13) NOT NULL,
	bookTitle varchar(50) NOT NULL,
	bookGenre varchar(10) NOT NULL,
	bookComp varchar(20) NOT NULL,
	bookPrice int,
	
	PRIMARY KEY(id)
);