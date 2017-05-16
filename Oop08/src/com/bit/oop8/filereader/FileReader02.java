package com.bit.oop8.filereader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader02 {

	public static void main(String[] args) {

		String fileName = "src/com/bit/oop8/filereader/grade.txt";
		
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader buffer = new BufferedReader(fileReader);
			
			String reader = new String();
//			while(reader != null) {
//				reader = buffer.readLine();
//			}
			
			while(true){
				// 한줄 읽기
				reader = buffer.readLine();
				// 읽은줄이 null(== 끝이면) 이면, 읽기 종료
				if(reader == null) break;
				// 번호:점수
//				System.out.println(reader);
				// 읽은 문자열을 : 을 기준으로 잘라서 grade 배열로 만듦
				String[] grade = reader.split(":");
//				System.out.printf("%2s번의 점수는 %s 입니다\n"
//							,grade[0],grade[1]);
//				System.out.print(grade[0] + "번의 점수는");
//				System.out.println(grade[1] + "입니다");
				System.out.printf("%2d번의 점수는 %3d 입니다\n",
						Integer.valueOf(grade[0]),
						Integer.valueOf(grade[1])
						);
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
