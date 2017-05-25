package com.bit.upgrade5.scope;

public class Hello03 {

	static int intNum1 = 0;
	static int intNum2 = 0;
	static int intSum = 0;
	
	public static void main(String[] args) {

		intNum1 =100;
		intNum2 =200;
		System.out.println(intSum); // 0
		덧셈();
		System.out.println(intSum); // 300
		
		ClassVO classVO = new ClassVO();
		System.out.println(classVO.intNum1);
		System.out.println(classVO.intNum2);
		System.out.println(classVO.intSum);
		
		classVO.덧셈();
		System.out.println(classVO.intNum1);
		System.out.println(classVO.intNum2);
		System.out.println(classVO.intSum);
		
		int 곱셈 = classVO.곱셈();
		System.out.println(classVO.intNum1);
		System.out.println(classVO.intNum2);
		System.out.println(classVO.intSum);
		
		
		
	   	
	}
	static void 덧셈(){
		intSum = intNum1 + intNum2;
	}

}
