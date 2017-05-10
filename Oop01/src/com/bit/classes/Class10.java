package com.bit.classes;

import java.util.ArrayList;

import com.bit.vo.GradeVO;

public class Class10 {

	public static void main(String[] args) {
		
		ArrayList<GradeVO> gVos = new ArrayList<GradeVO>();
		
		for(int i = 0 ; i < 50; i++){
			GradeVO vo = new GradeVO();
			vo.setIntNum(i+1); // 학생번호 세팅
			vo.setIntKor( (int)(Math.random()*(100-50)+50));
			vo.setIntEng( (int)(Math.random()*(100-50)+50));
			vo.setIntMath( (int)(Math.random()*(100-50)+50));
			gVos.add(vo);
		}
							// ArrayList의 개수
		for(int i = 0 ; i < gVos.size();i++){
			System.out.print(gVos.get(i).getIntNum() + "\t");
			System.out.print(gVos.get(i).getIntKor() + "\t");
			System.out.print(gVos.get(i).getIntEng() + "\t");
			System.out.println(gVos.get(i).getIntMath() );
		}
		
		for(int i = 0 ; i < gVos.size();i++){
			GradeVO v = gVos.get(i);
			System.out.print(v.getIntNum() + "\t");
			System.out.print(v.getIntKor() + "\t");
			System.out.print(v.getIntEng() + "\t");
			System.out.println(v.getIntMath() );
		}
		
		// 확장된, 향상된 for 구문
		for( GradeVO v : gVos ) {
			System.out.print(v.getIntNum() + "\t");
			System.out.print(v.getIntKor() + "\t");
			System.out.print(v.getIntEng() + "\t");
			System.out.println(v.getIntMath() );
		}
			
	}

}
