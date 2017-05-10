package com.bit.classes;

public class Grades {

	int intKor;
	int intEng;
	int intMath;
	
	int intTotal;
	int intAvg ;

	int intCn ;
	
	// 총점계산 Math
	void gradeTot(){
		// t = kor + eng + Math
		intTotal = intKor;
		intTotal += intEng;
		intTotal += intMath;
		
	}
	
	void gradeAvg(){
		intAvg = intTotal / intCn;
	}
	
	
}
