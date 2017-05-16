package com.bit.oop8.filereader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader01 {

	public static void main(String[] args) {

		// 읽기 위한 파일 설정
		String fileName = "src/com/bit/oop8/filereader/data.txt";
		
		// 파일을 읽기위해 열기 준비
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader buffer = new BufferedReader(fileReader);
			
			// 파일을 읽기 위한 임시 저장소
			String reader = new String(); // 주소를 담을 변수
			
			while(reader != null){
				reader = buffer.readLine();
				if(reader != null){
					System.out.println(reader);
				}
			}
			
			String reader1 ; // 초기값이 null 세팅, 값을 담을 변수
			String reader2 = "" ; // null 세팅
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
