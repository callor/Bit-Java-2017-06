package com.bit.params;

public class Params02 {

	public static void main(String[] args) {

		muliple(0, 100, 6); // 0부터 100까지 6의 배수의 합

	}
	
	static void muliple(int intStart, int intEnd, int intMulti){
		
		int intSum = 0;
		for(int i = intStart ; i <= intEnd ; i++){
			if( i % intMulti == 0) {
				intSum += i;
			}
		}
		System.out.println(intSum);
	}

}
