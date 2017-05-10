package com.bit.classes;

import com.bit.vo.BookVO;

public class Class05 {

	public static void main(String[] args) {

		BookVO book = new BookVO();
		
		// book.strTitle = "자바야놀자" : 직접접근
		book.setStrTitle("자바야놀자"); // method를 통해서 간접으로 접근
		
		book.setIntPrice(10000); // price 변수에 1000을 넣는다.
		
		System.out.println(book.getStrTitle()); // 읽기
		System.out.println(book.getIntPrice()); // 읽기
		
	}

}
