package com.bit.loop;

public class WhileLoop {

	public static void main(String[] args) {

//		for( ;; ) { } // 무한 loop
		int intNum = 0;
//		System.out.println(intNum++ == 1);
		
		while(intNum++ < 10) {
//			System.out.println(intNum + " 무한Loop");
		}
		
		String strNation = "Republic of Korea";
		String s = "" ;
		intNum = 0;
		while(s.equals("o") == false) {

			// 첫번째 방법
//			s = strNation.substring(intNum++, intNum);
			
			// 두번째 방법
			int intNum1 = intNum + 1;
			s = strNation.substring(intNum, intNum1);
			intNum ++;
			
			// 세번째 방법
//			s = strNation.substring(intNum, intNum + 1);
//			intNum ++
			
		}
		System.out.println(intNum + "번째 찾음");
	}
}
