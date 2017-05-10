package com.bit.params;

public class Params01 {

	public static void main(String[] args) {

		func01(0,1000,5); // 0 부터 999까지 수중 5의 배수의 합
		func01(0,100,2); // 0 부터 99까지 수중 2의 배수의 합
		func01(0,100,3) ; // 0 부터 99까지 수중 3의 배수의 합
	}
	
	static void func01(int num1, int num2, int num3){
		
		int intSum = 0;
		for(int i = num1 ; i < num2 ; i++){
			if( i % num3 == 0) {
				intSum += i ;
			}
		}
		System.out.println(num3 +"의 배수의 합:" + intSum);
	}

}




