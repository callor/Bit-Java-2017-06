package com.bit.exec;

public class Method02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sum(20);
		sum(10);
		sum(100);
		sum(1000);
		
		sum(3,33);
		
//		sum(1,2,3);
		
		
	}
	
	// 매개변수가 있는 함수 정의
	static void sum(int end) {
		int intSum = 0;
		for(int i = 1; i <= end ; i++){
			intSum += i;
		}
		System.out.println(intSum);
	}
	
	// 매개변수 개수가 다르면 같은 이름의 함수를 중복 정의 할수 있다.
	// method의 중복정의, Overload
	static void sum(int start, int end){
		int intSum = 0;
		for(int i = start ; i <= end ; i++){
			intSum += i;
		}
		System.out.println(intSum);
	}
	
	static void sum(int start, int end, int sum){

		for(int i = start; i<=end ; i++){
			sum += i;
		}
		System.out.println(sum);
		
		
	}
	

}
