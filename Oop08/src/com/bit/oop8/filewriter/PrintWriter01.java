package com.bit.oop8.filewriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriter01 {

	public static void main(String[] args) {

		String fileName = "src/com/bit/oop8/filewriter/grade.txt";
		
		PrintWriter pw = null; 
		// 파일을 기록하기위해 open
		try {
			
			// 쓰기금지 되어 있는 경우 예외가 발생할 수 있다.
			pw = new PrintWriter(fileName);
			for(int i = 0 ; i<100;i++){
				// 번호:점수
				pw.print(i+1);
				int grade = (int)(Math.random()*(100-50)+50);
				pw.print(":");
				pw.println(grade);
			}
			
			// 파일을 기록하기 위해 open 하면 반드시 닫아 줘야 한다.
			pw.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("파일을 쓰기로 열수 없습니다");
			// 만약 예외가 발생했을때, 파일을 닫지않고 app 이 종료되면
			// 그 파일은 문제가 될수 있다.
			// OS에서도 파일을 열기, 삭제가 안될수 있다.
			pw.close();

			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
		System.out.println("성적표 기록이 모두 끝났습니다");
		
		
	}

}
