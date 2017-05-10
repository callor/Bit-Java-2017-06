package com.bit.classes;

import com.bit.vo.BookVO;

public class Class06 {

	public static void main(String[] args) {
		
		// 변수배열은 배열 선언후 바로 사용이 가능
		int[] intNums = new int[10];
		intNums[0] = 0;
		System.out.println(intNums[1]);
		
		// 클래스 배열은 배열 선언 후 바로 사용 할 수 없다.
		BookVO[] books = new BookVO[10];
		
		// books 배열의 개별 항목을 객체(object)로 생성한다.
		for(int i = 0 ; i<books.length;i++){
			books[i] = new BookVO();
		}
		
//		books[0] = new BookVO() ; // 개별적으로 다시 생성을 해야 한다.
		books[0].setStrTitle("자바만세");
		books[0].setIntPrice(10000);
		
		
	}

}
