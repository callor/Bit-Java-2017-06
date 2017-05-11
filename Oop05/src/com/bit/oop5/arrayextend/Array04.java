package com.bit.oop5.arrayextend;

public class Array04 {

	public static void main(String[] args) {

//		int[] intArray = {1,2,3,4,5,5,4,3,2,1,1,2,3,4,5,5,4,3,2,1};
//		int[] intArray1 = {1,2,3,4,5,1,2,3,4,5};
		
		int[] intArray = new int[100];
		
		int intCnt = 0 ;
		for(int i = 0 ; i< intArray.length; i++){
		
			intCnt ++ ; // intCnt 를 1 증가
			if(intCnt > 5) intCnt = 1;
			intArray[i] = intCnt ;

		}
		
		for(int i : intArray){
			System.out.println(i);
		}
	}

}
