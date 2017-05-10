package com.bit.arrays;

public class GradeExec {
	
	// 총점계산 메서드
	public int execTotal(int[] intGrade){
		int intSum = 0;
		for(int i = 0 ; i < intGrade.length; i++){
			intSum +=  intGrade[i];
		}
		// 총점을 계산한 후에 원래 호출한곳으로 되돌린다.
		return intSum ;
	}
	
	// 평균계산 메서드   총점          학생수
	public int execAvg(int intTotal, int intStudents){
		return intTotal / intStudents;
	}

}



