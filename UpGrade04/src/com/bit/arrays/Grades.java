package com.bit.arrays;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		
		String[] strNum = new String[5];
		int[] intKor = new int[5];
		
		// 클래스를 객체(object, instance)로 생성
		GradeExec gradeExec = new GradeExec();
		
		Scanner scanner = new Scanner(System.in);
		for(int i = 0 ; i < strNum.length;i++){
			
			System.out.print(i+":번호>>"); // prompt
			String _s = scanner.nextLine(); // 키보드 입력
			strNum[i] = _s ; // 입력받은 번호를 배열에 저장(할당)
			
			// 실제사용할때
//			strNum[i] = scanner.nextLine();
			
			System.out.print("국어점수>>"); // prompt
			String _g = scanner.nextLine(); // 키보드 입력:문자열
			try {
				intKor[i] = Integer.valueOf(_g); // 문자열 => 정수변환
			} catch (NumberFormatException e) {
				System.out.println("점수를 정수로 바꿀수 없습니다");
				i--;
				// TODO: handle exception
			}
		} // 점수입력 끝
		
		// 총점계산 메서드 호출
		int intTotal = gradeExec.execTotal(intKor);
		
		// 평균을 구하는 메서드 호출
		// 총점과, 학생수를 보내준다.
		int intAvg  = gradeExec.execAvg(intTotal, intKor.length);
		
		System.out.printf(
				"학생 %d명의 국어점수 총점은 %d 이고, 평균은 %d입니다",
				intKor.length, intTotal, intAvg);
		
	}
}






