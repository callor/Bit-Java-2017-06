package com.bit.exec;

public class Method04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strNation ;
		strNation = nation("대한민국");
		System.out.println(strNation);

		int intAge ;
		intAge = nation(1980);
		System.out.println("나이는" + intAge + "입니다");
	}
	
	static String nation(String name) {
		return "우리나라는 " + name + " 입니다";
	}
	
	static int nation(int year){
		return 2017 - year;
	}

}
