package com.bit.classes;

// 객체지향의 상속
public class Grades5 extends Grades {
	
	int intSc ; // 과학
	int intSo ; // 사회
	/**
	 * 원래 Grades에 있는 3과목 합계 계산 method는
	 * 감춰지고, 5과목 합계 계산 method를 사용한다.
	 */
	@Override
	void gradeTot(){
		intTotal = intKor;
		intTotal += intEng;
		intTotal += intMath;
		
		intTotal += intSc;
		intTotal += intSo;
	}

}
