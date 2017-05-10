package com.bit.exec;

public class Method05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(10,20));
		
		float fNum1 = 3.0f ;
		float fNum2 = 5.0f ;
		
		float fSum = sum(fNum1, fNum2);
		System.out.println(fSum);
		
	}
	
	static int sum(int num1, int num2){
		return num1 + num2;
	}
	
	static float sum(float num1, float num2){
		return num1 + num2 ;
	}

}






