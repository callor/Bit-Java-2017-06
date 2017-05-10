package com.bit.loop;

public class While02 {

	public static void main(String[] args) {

		String strNation = "Republic of Korea";
		
		int intNum = 0;
		while(strNation
				.substring(intNum++,intNum)
				.equals("o") == false) ;
		System.out.println(intNum + "번째 찾음");

	}

}
