package com.bit.loop;

public class StringMethod {

	public static void main(String[] args) {

		String strNation = "Republic of Korea";
		
		// 문자열 추출
		System.out.println(strNation.substring(12, 17));
		// 소문자로 변경
		System.out.println(strNation.toLowerCase());
		// 대문자로 변경
		System.out.println(strNation.toUpperCase());
		
		String strKor = strNation.substring(12,17);
		// 문자열 비교
		System.out.println(strKor.equals("Korea")); // true
		System.out.println(strKor.equals("KOREA")); // false
		System.out.println(strKor.equalsIgnoreCase("KOREA")); // true
		System.out.println(strKor.equalsIgnoreCase("korea")); // true
		
		// 치환
		System.out.println(strNation.replace("Korea", "대한민국"));
		String str한국 = strNation.replace("Korea","대한민국");
		
		System.out.println(strNation + " >> " + str한국);
		
		
	}


}






