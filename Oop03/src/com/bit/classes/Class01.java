package com.bit.classes;

public class Class01 {

	public static void main(String[] args) {

		GradeVO[] vOS = new GradeVO[10];
		
		for(int i = 0 ; i < vOS.length; i++){
			
			vOS[i] = new GradeVO();
			vOS[i].setIntNum(i+1); // 번호 세팅

			int t = (int)(Math.random()*(100-50)+50);
			vOS[i].setIntKor(t);
			
			t = (int)(Math.random()*(100-50)+50);
			vOS[i].setIntEng(t);
			
			t = (int)(Math.random()*(100-50)+50);
			vOS[i].setIntMath(t);
			
		}
		gradeList(vOS);

		for(int i = 0 ; i < vOS.length; i++){
			for(int j = i ; j < vOS.length;j++){

				GradeVO vi = vOS[i];
				GradeVO vj = vOS[j];
				
//				if(vOS[i].getIntKor() > vOS[j].getIntKor()){
				if(vi.getIntKor() > vj.getIntKor()){
					
//					GradeVO t = vOS[i];
//					vOS[i] = vOS[j];
//					vOS[j] = t;
					
					vOS[i] = vj ;
					vOS[j] = vi ;
				}
			}
		}
		gradeList(vOS);
		
	}
	
	static void gradeList(GradeVO[] vOS){
		System.out.println("점수 확인");
		for(GradeVO v : vOS){
			System.out.print(v.getIntNum());
			System.out.print("\t");

			System.out.print(v.getIntKor());
			System.out.print("\t");

			System.out.print(v.getIntEng());
			System.out.print("\t");

			System.out.print(v.getIntMath());
			System.out.println();
		}
	}

}
