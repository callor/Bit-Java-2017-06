package com.bit.arrays;

public class Array01 {

	public static void main(String[] args) {

		int[] intNum = new int[10];
		int[] intKor = new int[10];
		int[] intEng = new int[10];
		
		for(int i = 0 ; i < intNum.length; i++){
			intNum[i] = i+1 ; // 번호를 순서대로 할당
			intKor[i] = (int)(Math.random()*(100-50)+50);
			intEng[i] = (int)(Math.random()*(100-50)+50);
		}
		gradeList(intNum, intKor, intEng);
		
		System.out.println("국어 점수 순으로 정렬");
		for(int i = 0 ; i < intKor.length; i++){
			for(int j = i ; j < intKor.length; j++){
				if(intKor[i] > intKor[j]){
					int t = intKor[i];
					intKor[i] = intKor[j];
					intKor[j] = t;
					
					// 번호 재정렬
					int n1 = intNum[i];
					intNum[i] = intNum[j];
					intNum[j] = n1;

					// 영어점수 재정렬
					int e1 = intEng[i];
					intEng[i] = intEng[j];
					intEng[j] = e1;

					
				}
			}
		}
		
		gradeList(intNum, intKor, intEng);
		

	}
	
	static void gradeList(int[] intNum, int[] intKor, int[] intEng){
		System.out.println("점수 확인");
		for(int i = 0 ; i < intNum.length;i++){
			System.out.print(intNum[i]);
			System.out.print("\t");

			System.out.print(intKor[i]);
			System.out.print("\t");

			System.out.print(intEng[i]);
			System.out.println();
		}
	}
}
