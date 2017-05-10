package com.bit.classes;

public class Mutiple {
	
	// member 변수
	public int intStart = 0;
	public int intEnd = 0;
	public int intM = 0;
	
	public int intSum = 0;
	
	// 매개 변수가 없는 method
	public void multy(){
		for(int i = intStart ; i < intEnd; i++){
			if(i%intM == 0) {
				intSum += i;	
			}
		}
	}
	
	
	// 3개의 매개변를 받아, 배수의 합을 구하는 method
	public int multy(int intStart, int intEnd, int intM){
		
		int intSum = 0;
		for(int i = intStart; i<intEnd;i++){
			if(i%intM == 0){
				intSum += i;
			}
		}
		return intSum;
	}

}
