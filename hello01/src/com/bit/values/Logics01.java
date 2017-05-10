package com.bit.values;

public class Logics01 {

	public static void main(String[] args) {

		int intNum = 33;
		int intC = intNum / 2; // 자동형변환
			// 실수가 자동으로 정수형으로 변환

		System.out.println(intC);
		
		if((intC * 2) == intNum) 
			System.out.println("짝수입니다");
		else
			System.out.println("홀수입니다");

	}

}
