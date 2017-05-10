package com.bit.exec;

public class Exec06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intGrade1 = 50;
		int intGrade2 = 80;
		int intGrade3 = 90;
		int intGrade4 = 70;
		int intGrade5 = 70;
		
		int intSum = intGrade1 
					+ intGrade2 
					+ intGrade3 
					+ intGrade4 
					+ intGrade5;
		
		int tmp = 0 ;
		
		// intGrades 배열 예약
		//                배열 사용준비, clear도 같이한다.
		int[] intGrades = new int[5];
		
		intGrades[0] = 90;
		intGrades[1] = 80;
		intGrades[2] = 100;
		intGrades[3] = 70;
		intGrades[4] = 80;
//		intGrades[5] = 75;

		// 일반 변수처럼 사용하는 방법
		int intSum1 = intGrades[0]
					+ intGrades[1]
					+ intGrades[2]
					+ intGrades[3]
					+ intGrades[4] ;
		
//		int temp = intGrades ;
		System.out.println(intSum1);
		
		// for를 응용한 방법
		intSum1 = 0;
		for(int i = 0 ; i < 5 ; i++){
			intSum1 += intGrades[i];
		}
		System.out.println(intSum1);
		
	}
}





