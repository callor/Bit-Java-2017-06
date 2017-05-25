package com.bit.upgrade5.scope;

public class Hello04 {

	public static void main(String[] args) {

		int intNum1 = 100;
		int intNum2 = 200;
		int intSum = 0;
		System.out.println("intSum"+intSum); //0
		함수(intNum1, intNum2);
		System.out.println("intSum(함수)"+intSum); //0
		
		int[] intArr = new int[10];
		System.out.println("Arr[0]" + intArr[0]); //0
		System.out.println("Arr[1]" + intArr[1]); //0
		System.out.println("Arr[2]" + intArr[2]); //0
		함수(intArr);
		System.out.println("Arr[0](함수)" + intArr[0]); //0
		System.out.println("Arr[1](함수)" + intArr[1]); //0
		System.out.println("Arr[2](함수)" + intArr[2]); //0
		
		NewClass newClass = new NewClass();
		System.out.println(newClass.name);
		함수(newClass);
		System.out.println(newClass.name); // 홍길동
		
		NewClass newClass01 = new NewClass();
		newClass = newClass01 ;
		
		newClass01.name = "이몽룡";
		System.out.println(newClass01.name); // 이몽룡
		System.out.println(newClass.name ); // 이몽룡
		
		newClass.name = "장보고";
		System.out.println(newClass01.name); // 장보고
		
	}
	// 함수가 받은 매개변수는
	// 함수 내에서 변경이 되어도 원본은 변경되지 않는다.
	static void 함수(int intNum1, int intNum2){
		int intSum = intNum1 + intNum2;
	}
	
	// 함수가 받은 매개변수배열은
	// 함수 내에서 변경을 하면 원본이 변경된다.
	static void 함수(int[] intArr){
		intArr[0] = 100;
		intArr[1] = 100;
		intArr[2] = intArr[0] + intArr[1];
	}
	
	// 함수가 받은 객체는
	// 함수내에서 객체의 맴버변수를 변경하면
	// 원본의 매개변수도 변경된다.
	static void 함수(NewClass newClass){
		newClass.name="홍길동";
	}

}
