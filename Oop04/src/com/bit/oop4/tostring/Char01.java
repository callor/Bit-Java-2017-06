package com.bit.oop4.tostring;

public class Char01 {

	public static void main(String[] args) {

		char ch = 'A';
		System.out.println(ch);
		
		// 문자(char)는 덧셈 뺄셈이 가능
		int num = ch - 'A';
		System.out.println(num);
		System.out.printf("%d\n",ch-0);
		
		System.out.printf("%d\n", '0' - 0);
		System.out.printf("%d\n", 'a' - 0);
		
		// A 부터 Z 까지 ASCII 코드 보기
		for(int i = 'A' ; i <= 'Z' ; i++){
			System.out.println(i);
		}
		
		// A 부터 Z 까지 문자 리스트를 보기
		for(char i = 'A' ; i <= 'Z';i++){
			System.out.println(i);
		}
		
	}

}
