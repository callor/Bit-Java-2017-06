package com.bit.classes;

public class Class02 {

	public static void main(String[] args) {

//		Grades grades = new Grades();
		Grades5 grades = new Grades5();
		
		grades.intKor = 80;
		grades.intEng = 80;
		grades.intMath = 70;
		
		grades.intSc = 80;
		grades.intSo = 70;
				
		
		grades.intCn = 5;
		
		// Grades 클래스에 있는  합계
		grades.gradeTot(); 
		
		grades.gradeAvg();
		
		System.out.println(grades.intTotal);
		System.out.println(grades.intAvg);
		
		
	}

}
