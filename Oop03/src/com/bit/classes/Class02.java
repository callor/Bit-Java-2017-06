package com.bit.classes;

public class Class02 {

	public static void main(String[] args) {
		GradeVO2[] vOS = new GradeVO2[10];
		
		for(int i = 0 ; i < vOS.length; i++){
			
			vOS[i] = new GradeVO2();
			vOS[i].setIntNum(i+1); // 번호 세팅

			int t = (int)(Math.random()*(100-50)+50);
			vOS[i].setIntKor(t);
			
			t = (int)(Math.random()*(100-50)+50);
			vOS[i].setIntEng(t);
			
			t = (int)(Math.random()*(100-50)+50);
			vOS[i].setIntMath(t);
			
		}
		for(GradeVO2 v : vOS){
			v.gradeList();
		}
	
	}

}
