package com.bit.loop;

public class ForBreak {

	public static void main(String[] args) {

		String strNation = "Republic of Korea";

		for(int i = 0 ; i < strNation.length(); i++){
			String s = strNation.substring(i, i+1);
//			if(i > 10) break ;
//			if(s.equals("o")) {
//				System.out.println(i + "번째 위치함");
//				break; // for loop를 중단
//			}
		}
		
		int intSum = 0;
		int intNum = 0;
		for( ;; ) {

			if(intNum > 10) break; // 11까지 덧셈, intNum 11이 되었을때 break
			intNum ++;
//			if(intNum > 10) break; // 10까지 덧셈
			intSum += intNum ;
			
			
		}
		System.out.println(intSum);
	}
}





