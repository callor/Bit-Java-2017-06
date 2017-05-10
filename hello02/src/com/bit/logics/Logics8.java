package com.bit.logics;

public class Logics8 {

	public static void main(String[] args) {

		int intSum = 0;
		for(int i = 0 ; i <=100 ; i++){
			if(i%2 != 0){
				// 홀수만
				intSum += i;
			}
		}
		System.out.println(intSum);
		
		for(int i = 0 ; i <= 10 ; i++){
			if(i%2 == 0){
				System.out.println("짝수"+i);
			}
		}
	}

}
