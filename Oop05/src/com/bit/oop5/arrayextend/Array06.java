package com.bit.oop5.arrayextend;

public class Array06 {

	public static void main(String[] args) {

		int[] intArray = new int[100];
		int intCnt = 0 ;
		
		// 1,2,3,4,5,1,2,3,4,5
		for(int i = 0 ; i<intArray.length;i++){
			intCnt ++ ;
			if(intCnt > 5) intCnt = 1;
			intArray[i] = intCnt;
		}
		
		for(int i = 0 ; i < intArray.length; i++){
			System.out.print(intArray[i] + "\t");
			if((i+1) % 5 == 0)System.out.println();
		}
		System.out.println();
	}
}





