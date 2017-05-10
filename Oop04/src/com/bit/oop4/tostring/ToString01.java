package com.bit.oop4.tostring;

public class ToString01 {

	public static void main(String[] args) {

		// 3+9+2+9+3+9+3+3
		int num = 392;
		
		/*
		 * 1. 숫자(열)을 문자열로 변환을 시켜
		 * 2. 문자열을 문자(char) 배열로 만듦
		 * 3. 문자(char) 배열 요소를 다시 숫자로 바꾸어서
		 * 4. 반복문을 써서 합산
		 */
		
		// num 숫자(열)을 문자열로 변환
		String strNum = Integer.toString(num);
		
		// 문자열을 문자(char) 배열로 만듦
		char[] charNum = strNum.toCharArray();
		
		int intSum = 0 ;
		for(int i = 0 ; i<charNum.length; i++){
			System.out.print(charNum[i] + "\t");
			
//			System.out.println(Integer.valueOf(charNum[i]));
			// 문자(ASCII)를 실제 숫자로 변환
//			intSum += Integer.valueOf(charNum[i]);
			
			intSum += charNum[i] - '0';
			
		}
		System.out.println(intSum);
		
		
	}

}
