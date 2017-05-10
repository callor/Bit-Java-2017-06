package com.bit.logics;

public class Start1 {

	public static void main(String[] args) {

		int intNum = 10;
		
		intNum -= 1; // 9
		intNum -- ;  // 9
		-- intNum ;  // 7
		for(int i = 10 ; i > 0 ; i--){
			System.out.println(i);
		}
		
		for(int i = 0 ; i < 10 ; i++) {
			for(int j = 10 - i ; j > 0 ; j--){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// if를 사용하지 않은 짝수 덧셈연산
		int intSum = 0 ;
		for(int i = 0 ; i <= 10 ; i += 2) {
			intSum += i;
		}
		System.out.println(intSum);

	}

}








