package com.bit.loop;

public class ForLoop {

	public static void main(String[] args) {

		int intNum = 0;
		
		String strNation = "Republic of Korea" ;
		// 문자열 변수에 점(.)을 찍어 확장된 기능을 사용한다.
		// substring(int) : 문자열 중 일부를 추출하여 내는 기능
		String strKor = strNation.substring(12);
		
		String strEng = "United State America"; // .substring(13,20);
		System.out.println(strEng);
		
		for(int i = 0 ; i < strEng.length() ; i++) {
//			System.out.println(strNation.substring(i,i+1));
			System.out.println(strEng.substring(i,i+1));
		}
		
//		System.out.println(strNation);
//		System.out.println(strKor);
//		System.out.println(strEng);
//		
//		test();

	}
	
	static void test(){
		System.out.println("나는 연습용입니다");
	}

}
