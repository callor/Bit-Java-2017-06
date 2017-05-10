package com.bit.oop4.exec;

import com.bit.oop4.vo.BookVO;

public class Exec04 {

	public static void main(String[] args) {

		int num1 = 30;
		System.out.println("num1:" + num1);
		
		setInt(num1); // 값만 주고 마는것
		num1 = setInt(num1); // 값을 주고 결과를 되 돌려 받는것

		System.out.println("num1:"+num1);
		
		BookVO vo = new BookVO();
		vo.setStrTitle("자바야놀자");
		vo.setStrAuthor("남궁성");
		vo.setIntPrice(3000);
		
		System.out.println("첫번째:" + vo.toString());
		setRef(vo);
		System.out.println("두번째:" + vo.toString());
		
	}
	static int setInt(int num){
		num = 100;
		return num ;
	}
	
	static void setRef(BookVO vo1){
		vo1.setStrTitle("윈도우세상");
	}
	

}
