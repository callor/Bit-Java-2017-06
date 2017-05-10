package com.bit.exec;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		함수();
		계산();
	}
	

	// 함수를 정의
	static void 함수() {
		System.out.println("나는 함수입니다");
		System.out.println("안녕하세요");
		System.out.println("반갑습니다");
	}
	
	static void 계산(){
		System.out.println(30+40);
		System.out.println(30*10);
		System.out.println(30-10);
		System.out.println(30/10);
	}
}
