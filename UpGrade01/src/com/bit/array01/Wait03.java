package com.bit.array01;

public class Wait03 {

	public static void main(String[] args) {

		String strNation = "Republic of Korea";
		
		String strTemp = strNation.substring(5, 8);
		System.out.println(strNation);
		System.out.println(strTemp);
		
		for(int i = 0 ; i < strNation.length();i++){
			String s = strNation.substring(i,i+1);
			System.out.print(s);
		}
		System.out.println();
		
		for(int i = strNation.length()-1 ; i >=0 ; i--){
			String s = strNation.substring(i,i+1);
			System.out.print(s);
		}
		
		for(int i = 0 ; i < strNation.length() ; i++){
			String s = strNation.substring(
					strNation.length() - i - 1,
					strNation.length() - i);
			System.out.print(s);
		}
		
	}

}
