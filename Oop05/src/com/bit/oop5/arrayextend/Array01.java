package com.bit.oop5.arrayextend;

public class Array01 {

	public static void main(String[] args) {

		int[] intArray = new int[10];
		
		for(int i = 0 ; i < intArray.length ;i++){
			
			// 1부터 10까지 임의의 숫자를 할당
			intArray[i] = (int)(Math.random()*10+1) ;
			
		}
		
		for(int i=0 ; i < intArray.length;i++){
			System.out.println(i+":" + intArray[i]);
		}
		
		int cnt = 0 ;
		for(int i : intArray){
			System.out.println(cnt + ":" + i);
			cnt ++ ;
		}

	}
}
