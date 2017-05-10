package com.bit.array01;

public class Array04 {

	public static void main(String[] args) {

		String strNation = "Republic of Korea";
		
		// split(" ");
		// strNation을 space를 기준으로 단어로 잘라
		// 배열로 만들어 준다.
		String[] strWord = strNation.split(" ");
		
		for(int i = 0 ; i< strWord.length;i++){
			System.out.println(strWord[i]);
		}
	
	}
}





