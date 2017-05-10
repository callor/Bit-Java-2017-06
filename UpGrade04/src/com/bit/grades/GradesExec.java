package com.bit.grades;

import java.util.concurrent.Executor;

public class GradesExec {

	public static void main(String[] args) {

		String[] strNum = new String[50];
		int[] intKor = new int[50];
		
		GradesProcess gradesProcess = new GradesProcess();
		
		for(int i = 0 ; i < strNum.length; i++){
			strNum[i] = Integer.toString(i+1) ; // 숫자를 문자열로
			// 50부터 99점까지 임의의 점수를 생성, 배열에 할당
			intKor[i] = (int)(Math.random() * (100-50)+50);
		}
		
		gradesProcess.strNum = strNum ;
		gradesProcess.intKor = intKor ;
		
		gradesProcess.execTotal();
//		gradesProcess.intTotal = 6000 ;
		gradesProcess.execAvg();
		
//		System.out.printf(
//				"총점은 %d 이고, 평균은 %d 입니다",
//				gradesProcess.getIntTotal(),
//				gradesProcess.getIntAvg());

		gradesProcess.getListKor();
		
	}
}





