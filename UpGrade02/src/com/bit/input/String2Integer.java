package com.bit.input;

public class String2Integer {

	public static void main(String[] args) {

		String strNum = "30";
		Integer intNum = 0;

		// 문자열을 숫자로 바꾸기
		intNum = Integer.valueOf(strNum) ;
		
		// 숫자를 문자열로 바꾸기
		strNum = Integer.toString(intNum);
		
		System.out.println(Integer.valueOf("30"));
		System.out.println(Integer.valueOf("30A"));
		
	}

}
