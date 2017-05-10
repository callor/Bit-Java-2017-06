package com.bit.grade.exec;

import java.util.ArrayList;

import com.bit.grade.dto.GradeDTO;
import com.bit.grade.vo.GradeVO;

public class GradeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<GradeVO> gradeVOs = new ArrayList<GradeVO>();
		
		for(int i = 0 ; i<50; i++){
			
			GradeVO vo = new GradeVO();
			vo.setIntNum(i+1); // 학번지정
			
//			for(int j = 0 ; j < vo.getIntGrade().length;j++){
//			}
			
			// intGrade 배열을 it 배열에 복사
			int[] it = vo.getIntGrade();
			for(int j = 0 ; j < it.length ;j++){
				it[j] = (int)(Math.random()*(100-50)+50);
			}
			vo.setIntGrade(it);
			// ArrayList에 추가
			gradeVOs.add(vo);
		}
		
		System.out.println("점수확인");
		for(GradeVO v : gradeVOs){
			
			System.out.print(v.getIntNum() + "\t");
			for(int i : v.getIntGrade()) {
				System.out.print(i + "\t");	
			}
			System.out.println();
			
		}
		System.out.println("=======================");
		
		for(GradeVO v : gradeVOs){
			int intT = 0 ;
			for(int i : v.getIntGrade()) {
				intT += i ; // 개별 점수를 intT에 누적 
			}
			v.setIntTotal(intT);
			v.setIntAvg(intT / v.getIntGrade().length) ;
		}
		
		System.out.println("총점과 평균 확인");
		for(GradeVO v : gradeVOs){
			
			System.out.print(v.getIntNum() + "\t");
			for(int i : v.getIntGrade()) {
				System.out.print(i + "\t");	
			}
			System.out.print(v.getIntTotal()+"\t");
			System.out.println(v.getIntAvg());
			System.out.println();
			
		}
		System.out.println("=======================");
		
		
		// 학생점수 중에서 총점 최고점인 학생의 성적리스트와
		//                 총점 최저점인 학생의 성적리스트를 찾아 보이시
		// 7 90 90 90 90 90 90  999 90
		
		int intMax = 0;
		int intMaxNum = 0 ;
		
		int intMin = 990;
		int intMinNum = 0;
		for(GradeVO v : gradeVOs) {
			int intTotal = v.getIntTotal(); // 총점 읽기
			// 최고점 찾기
			if(intMax < intTotal) { // intMax와 총점 비교
				intMax = intTotal ; // 총점의 최고점을 찾기
				intMaxNum = v.getIntNum();
			}
			// 최저점 찾기
			if(intMin > intTotal){
				intMin = intTotal;
				intMinNum = v.getIntNum();
			}
		}
		
		for(int i = 0 ; i< gradeVOs.size();i++){
			int intTotal = gradeVOs.get(i).getIntTotal();
			if(intMax < intTotal) {
				intMaxNum = i;
			}
		}
		
//		System.out.println(intMax);
		// 최고점 학생의 성적 리스트
		System.out.println("최고점 학생의 성적리스트");
		GradeVO v1 = gradeVOs.get(intMaxNum - 1);
		
		System.out.print(v1.getIntNum() + "\t");
		for(int i : v1.getIntGrade()) {
			System.out.print(i + "\t");	
		}
		System.out.print(v1.getIntTotal()+"\t");
		System.out.println(v1.getIntAvg());
		
		
		
		

	
	}

}
