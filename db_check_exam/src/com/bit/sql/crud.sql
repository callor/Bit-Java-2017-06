-- create : insert
INSERT INTO book_table ( bookCode, bookTitle, bookGenre,bookComp,bookPrice)
VALUES ('9788968461475','이것이 자바다','IT','한빛 출판사',30000);

-- read : select
SELECT * FROM book_table ;

-- update : update
UPDATE book_table SET
	bookCode = '978-0001' ,
	bookTitle = '접시꽃 당신',
	bookGenre = '시집',
	bookComp = '김영사',
	bookPrice = 12000
WHERE id = 2 ;

-- delete : delete
DELETE FROM book_table WHERE id = 3;
	