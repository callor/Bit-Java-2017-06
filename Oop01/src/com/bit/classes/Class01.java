package com.bit.classes;

public class Class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intKor = 80;
		int intEng = 70;
		int intMath = 60;
		
		int tot = gradeTot(intKor, intEng, intMath);
		int avg = gradeAvg(tot, 3); // (3, tot) ;
		
	}
	
	// 총점계산 함수
	static int gradeTot(int intKor, int intEng, int intMath){
		return intKor + intEng + intMath ; // 총점
//		return (intKor + intEng + intMath) /3 ; // 평균
	}
	
	static int gradeAvg(int intTotal, int intCnt){
		return intTotal / intCnt ;
	}

}
