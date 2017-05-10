package com.bit.classes;

import java.util.ArrayList;

import com.bit.vo.BookVO;

public class Class08 {

	public static void main(String[] args) {

		// Class만을 위한 특별한 배열구조
		// arrString 이라고 하는 비어있는 배열을 만든다.
		ArrayList<String> arrString = new ArrayList<String>();
		
		String s = "대한민국"; 
		arrString.add(s); // ArrayList 0번 위치에 값을 추가

		arrString.add("우리나라"); // 1번 위치에 값 추가
		arrString.add("Korea") ; // 2번 위치에 값 추가
		
		System.out.println(arrString.get(1));
		
		// 정수형 List
		ArrayList<Integer> arrInt = new ArrayList<Integer>();
		
		// 실수형 List
		ArrayList<Float> arrFloat = new ArrayList<Float>();
		
		
	}

}




