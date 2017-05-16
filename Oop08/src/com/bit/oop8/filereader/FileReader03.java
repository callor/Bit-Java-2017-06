package com.bit.oop8.filereader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader03 {

	public static void main(String[] args) {

		String fileName = "src/com/bit/oop8/filewriter/grade.txt";
		int intCount = 0;
		int intSum = 0;
		
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader buffer = new BufferedReader(fileReader);
			
			String reader = new String();
			
			while(true){
				reader = buffer.readLine();
				if(reader == null) break;
				String[] grade = reader.split(":");
			
				intCount++; // 학생수(데이터 수 계산)
				intSum += Integer.valueOf(grade[1]); // 점수만 누적
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("총 학생수:" + intCount);
		System.out.println("총 점:" + intSum);
		System.out.println("총 평균:" + (intSum / intCount));
		
		
	}

}
