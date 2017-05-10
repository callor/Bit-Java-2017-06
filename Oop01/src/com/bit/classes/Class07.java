package com.bit.classes;

import com.bit.vo.GradeVO;

public class Class07 {

	public static void main(String[] args) {
		GradeVO[] grades = new GradeVO[5];
		for(int i = 0 ; i < grades.length; i++){
			grades[i] = new GradeVO();
			
			grades[i].setIntNum(i+1); // 학생번호 세팅
			grades[i].setIntKor( (int)(Math.random()*(100-50)+50));
			grades[i].setIntEng( (int)(Math.random()*(100-50)+50));
			grades[i].setIntMath( (int)(Math.random()*(100-50)+50));
		
		}
		
		for(int i = 0 ; i < grades.length;i++){
			int t = gradeTot(grades[i]);
			grades[i].setIntTotal(t);
		}
		
		for(int i = 0 ; i < grades.length;i++){
			System.out.print(grades[i].getIntNum()+ "\t");
			
			// 총점계산
			grades[i].setIntTotal(gradeTot(grades[i]));
			System.out.print(grades[i].getIntTotal()+"\t");
		
			// 평균계산
			grades[i].setIntAvg(gradeAvg(grades[i]));
			System.out.println(grades[i].getIntAvg());
		}
		
//		gradeTot(grades);
	
	}
	
	 static int gradeTot(int intKor, int intEng, int intMath){
		 int t = intKor;
		 t += intEng;
		 t += intMath;
		 return t;
	 }
	static int gradeTot(GradeVO grade){
		
		int t = grade.getIntKor();
		t += grade.getIntEng();
		t += grade.getIntMath();
		return t;
	}
	
	static int gradeAvg(GradeVO grade){
		return grade.getIntTotal() / 3;
	}
	
	static void gradeTot(GradeVO[] grades){
		for(int i = 0 ;i < grades.length;i++){
			int t = grades[i].getIntKor();
			t += grades[i].getIntEng();
			t += grades[i].getIntMath();
			grades[i].setIntTotal(t);
		}
	}

}
