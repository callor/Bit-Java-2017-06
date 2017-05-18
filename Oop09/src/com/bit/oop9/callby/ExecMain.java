package com.bit.oop9.callby;

public class ExecMain {

	public static void main(String[] args) {

		int intNum = 30;
		함수(intNum); // 변수는 값을 넘겨준다 : Call by Value
		System.out.println(intNum);
		
		Class01 객체 = new Class01();
		객체.strName = "이몽룡";
		System.out.println(객체.strName);
		
		함수(객체); // 객체는 주소를 넘겨준다 : Call by Reference
		System.out.println(객체.strName); // 결과:홍길동
		
		int[] intNums = new int[1] ;
		intNums[0] = 50;
		함수(intNums); // 배열도 주소를 넘겨준다 : Call by Reference
		System.out.println(intNums[0]); // 결과:60
		
	}
	static void 함수(int[] nums){
		nums[0] = 60;
	}
	
	
	static void 함수(int num){
		num = 40;
	}
	
	static void 함수(Class01 객체들){
		객체들.strName = "홍길동";
	}

}




