package com.bit.array01;

public class Array05 {

	public static void main(String[] args) {

		String strNation = "Republic of Korea";
	
		// 글자를 잘라 배열에 넣기
		String[] strAlpa = new String[ strNation.length() ];
		
		for(int i = 0 ; i < strAlpa.length; i++) {
			strAlpa[i] = strNation.substring(i, i+1);
		}
		//------------
		
		// 글자를 잘라 배열을 생성
		// 위에서 생성된 strAlpa값이 감춰지고 새로 만들어진다.
		strAlpa = strNation.split("");
		
		for(int i = 0 ; i < strAlpa.length; i++){
			System.out.print(strAlpa[i]);
		}
		System.out.println();
		
		for(int i = (strAlpa.length - 1) ; i >= 0 ; i-- ){
			System.out.print(strAlpa[i]);
		}
	}

}




