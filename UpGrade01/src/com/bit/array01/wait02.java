package com.bit.array01;

public class wait02 {

	public static void main(String[] args) {

		Integer intNum = 11;
		while(intNum < 1000){
			
			// 숫자(Integer)를 문자열로 바꾸기
			String strNum = intNum.toString();
			String strRevers = "";
			// 문자열 뒤에서부터 한글자씩 잘라내어 strRevers에 붙이기
			for( int i = 0 ; i < strNum.length();i++){
				strRevers += strNum.substring(
						strNum.length()-i -1,
						strNum.length()-i);
			}
			// 원래 수와, 뒤집힌 수가 같은지 확인
//			if(intNum == Integer.valueOf(strRevers)) {
			if(strNum.equals(strRevers)){
				System.out.println(intNum + "\t" + strRevers);
			}
			intNum ++ ;
		}
	}
}
