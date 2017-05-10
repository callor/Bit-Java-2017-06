package com.bit.grades;

public class GradesProcess {

	public String[] strNum ;
	public int[] intKor;
	
	private int intTotal = 0;
	private int intAvg = 0;
	
	public int execTotal(){
		for(int i = 0 ; i < strNum.length;i++){
			intTotal += intKor[i];
		}
		return 0;
	}
	
	public int execAvg(){
		intAvg = intTotal / strNum.length;
		return 0;
	}
	
	// private 으로 선언된 intTotal 값을 외부에서 읽는 통로
	public int getIntTotal(){
		return intTotal;
	}
	// private으로 선언된 intAvg 값을 외부에서 읽는 통로
	public int getIntAvg(){
		return intAvg;
	}
	
	public void getListKor(){
		System.out.println("국어 점수리스트");
		System.out.println("===========================");
		for(int i = 0 ; i < strNum.length; i++){
			System.out.printf("%s 번 : 점수 = %d\n",
					strNum[i],
					intKor[i]);
		}
		System.out.println("---------------------------");
		System.out.printf("총점 : %d\n", intTotal);
		System.out.printf("평균 : %d\n",intAvg);
		System.out.println("===========================");
	}
}




