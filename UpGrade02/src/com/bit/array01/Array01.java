package com.bit.array01;

import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {

		String[] arrStr = new String[10];
		Scanner scanner = new Scanner(System.in);
		for(int i = 0 ; i < arrStr.length ; i++){
			System.out.println("숫자>>");
			String _k = scanner.nextLine();
			
			if(_k.equals("END--")) break ;
			
			arrStr[i] = _k;
		}
		System.out.println("입력이 끝났습니다");
		
		int intSum = 0 ;
		for(int i = 0 ; i < arrStr.length; i++){
			if( arrStr[i] != null ) {
				intSum += Integer.valueOf(arrStr[i]);	
			}
		}
		System.out.println("총 합:" + intSum);
	
	}

}



