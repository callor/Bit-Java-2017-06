package com.bit.grade.exec;

import java.util.ArrayList;

import com.bit.grade.dto.GradeDTO;
import com.bit.grade.vo.GradeVO;

public class GradeEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GradeDTO dto = new GradeDTO(); // dto객체 생성

		// 점수생성
		dto.gradeMake();
		
		//dto.setVOs(gradeVOs); // dto에 있는 ArrayList에 값을 복사해줌
		System.out.println("점수 확인");
		dto.gradeVOListView(); // 점수리스트 확인
		// 총점과 평균이 계산되기 이전 점수리스트
		
		dto.gradeTotal(); // 총점과 평균 계산
		System.out.println("총점과 평균 확인");
		dto.gradeVOListView();
		// 총점과 평균이 계산된 후 점수 리스트
	}

}
