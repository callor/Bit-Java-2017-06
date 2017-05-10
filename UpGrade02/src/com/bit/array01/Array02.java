package com.bit.array01;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		// 1. 정수형 배열 10개를 만드시오
		// 2. 0부터 9까지 난수를 발생하여 배열을 채우시오
		// 3. 키보드에서 0부터 9까지 임의 숫자를 입력받아
		// 4. 배열에 값이 있으면 "있음"
		//		없으면 "없음"으로 표시 하시오

		int[] intNum = new int[10];
		for(int i = 0; i < intNum.length;i++){
			intNum[i] = (int)(Math.random() * 10); 
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자>>");
		String keyIn = scanner.nextLine();
		
		int intPos = 0;
		for(int i = 0 ; i < intNum.length ;i++){
			if(intNum[i] == Integer.valueOf(keyIn)) {
				intPos = i + 1;
				break ;
//				System.out.println("있음");
			} 
		}
		if(intPos > 0) {
			System.out.println(intPos + "위치에 있음");
		} else {
			System.out.println("없음");
		}
	}

}
