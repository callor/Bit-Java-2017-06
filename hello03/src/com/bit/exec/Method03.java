package com.bit.exec;

public class Method03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int retSum = 0;
		retSum = sum(1,100);
		System.out.println(retSum);
	}
	
	//     자료형에 해당하는 키워드
	static int sum(int start, int end){
		int intSum = 0;
		for(int i = start; i<=end ; i++){
			intSum += i;
		}
		
		// 자료형 키워드가 있으면 반드시 return이 있다.
		return intSum;
//		System.out.println(intSum);
	}

}





