package com.bit.grade.dto;

import java.util.ArrayList;

import com.bit.grade.vo.GradeVO;

public class GradeDTO {
	
	private ArrayList<GradeVO> VOs = new ArrayList<GradeVO>();

	public void gradeMake(){
		for(int i = 0 ; i<50; i++){
			
			GradeVO vo = new GradeVO();
			vo.setIntNum(i+1); // 학번지정
			
			// intGrade 배열을 it 배열에 복사
			int[] it = vo.getIntGrade();
			for(int j = 0 ; j < it.length ;j++){
				it[j] = (int)(Math.random()*(100-50)+50);
			}
			vo.setIntGrade(it);
			// ArrayList에 추가
			VOs.add(vo);
		}
	}
	
	// 총점과 평균 계산
	public void gradeTotal(){
		for(GradeVO v : VOs){
			int intT = 0 ;
			for(int i : v.getIntGrade()) {
				intT += i ; // 개별 점수를 intT에 누적 
			}
			v.setIntTotal(intT);
			v.setIntAvg(intT / v.getIntGrade().length) ;
		}
	}
	
	// 점수 리스트 확인
	public void gradeVOListView(){
//		System.out.println("총점과 평균 확인");
		for(GradeVO v : VOs){
			
			System.out.print(v.getIntNum() + "\t");
			for(int i : v.getIntGrade()) {
				System.out.print(i + "\t");	
			}
			System.out.print(v.getIntTotal()+"\t");
			System.out.println(v.getIntAvg());
		}
	}
	
	
	public ArrayList<GradeVO> getVOs() {
		return VOs;
	}

	public void setVOs(ArrayList<GradeVO> vOs) {
		VOs = vOs;
	}
	

}
