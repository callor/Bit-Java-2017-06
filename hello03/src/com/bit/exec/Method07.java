package com.bit.exec;

public class Method07 {
	
	// class 전역변수
	// class 내부 어떤 method에서도 참조 할 수 있다.
	// class 전역변수는 가급적 private 으로 선언한다.
	private static float pi = 3.141592f;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strNation = "Republic of Korea";
		strNation = "Korea" ;
		System.out.println(pi());
	}
	static float pi(){
//		float pi = 3.141592f ;
		return pi;
	}
}
