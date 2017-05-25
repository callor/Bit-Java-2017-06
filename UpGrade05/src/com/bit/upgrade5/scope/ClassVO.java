package com.bit.upgrade5.scope;

public class ClassVO {

	// 클래스 전역 scope
	// 클래스 내부의 어떤 method에서도 호출(읽고, 쓰기)가능
	String name;
	int intNum1;
	int intNum2;
	
	int intSum;
	
	public void 덧셈(){
		intNum1 = 100;
		intNum2 = 200;
		intSum = intNum1 + intNum2;
	}
	
	public int 곱셈(){
		intNum1 = 3;
		intNum2 = 5;
		int intMul = intNum1 * intNum2;
		return intMul;
	}

}
