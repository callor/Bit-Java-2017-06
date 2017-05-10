package com.bit.input;

import java.util.Scanner;

public class KeyInput02 {

	public static void main(String[] args) {

		int[] intGrades = new int[10];
		Scanner scanner = new Scanner(System.in);
		
		// 키보드에서 10개의 성적을 입력받기
		for(int i = 0 ; i < intGrades.length;i++){
			// 입력받을 data에 대한 메시지 보이기
			System.out.println(i+" 번째 성적입력");
			
			// 키보드에서 문자열 입력받기
			String keyin = scanner.nextLine();
			
			// 입력받은 문자열을 숫자(정수)로 변경하기
			intGrades[i] = Integer.valueOf(keyin);
		}
		
		// 배열에 저장된 값을 확인하기
		for(int i = 0 ; i < intGrades.length;i++){
			System.out.print(intGrades[i] + "\t");
		}
		System.out.println();
	
	}
}





