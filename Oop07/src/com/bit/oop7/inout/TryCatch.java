package com.bit.oop7.inout;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray = new int[10];

		for(int i = 0 ; i <= 10 ; i++){
			try{
				intArray[i] = (int)(Math.random()*10+1);	
			} catch (ArrayIndexOutOfBoundsException e){
				System.out.println("배열의 크기를 초과 했습니다");
				System.out.println("현재 입력된 부분까지만 처리합니다");
			}
		}
		
		int intSum = 0;
		for(int i : intArray){
			intSum += i;
		}
		System.out.println(intSum);
	}
}
