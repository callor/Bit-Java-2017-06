package com.bit.oop4.exec;

import com.bit.oop4.vo.BookVO;

public class Exec03 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("num1:" + num1);
		System.out.println("num2:" + num2);

		num2 = num1 ;
		num2 = 100;
		
		System.out.println("num1:" + num1);
		
		BookVO vo1 = new BookVO();
		vo1.setStrTitle("자바만세");
		vo1.setStrAuthor("홍길동");
		vo1.setIntPrice(20000);
		
		System.out.println("vo1:" + vo1.toString());
		
		BookVO vo2 = new BookVO();
		vo2 = vo1 ;
		System.out.println("vo2:"+ vo2.toString());
		
		vo2.setStrTitle("윈도우만세");
		System.out.println("vo1:" + vo1.toString());
		System.out.println("vo2:" + vo2.toString());
		
		
		
		
	}

}
