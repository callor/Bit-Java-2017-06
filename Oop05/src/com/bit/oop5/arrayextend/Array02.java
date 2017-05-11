package com.bit.oop5.arrayextend;

public class Array02 {

	public static void main(String[] args) {

		int[] intArray = new int[100];
		
		for(int i = 0 ; i < intArray.length;i++){
			intArray[i] = (int)(Math.random()*100+1);
		}
		
		int intPos = 0;
		for(int i = 0 ; i < 10 ; i ++){
			for( int j = 0 ; j < 10 ; j++){
				System.out.print(intArray[intPos++] + "\t");
			}
			System.out.println();
		}
		
		for(int i = 0 ; i < intArray.length;i++){
			System.out.print(intArray[i] + "\t");
			if(i % 10 == 0 )System.out.println();
		}
		
		int cnt = 0 ;
		for(int i : intArray) {
			System.out.print(i+"\t");
			if(++cnt % 10 == 0) System.out.println();
		}
	}
}
