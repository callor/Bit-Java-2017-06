package com.bit.oop7.inout;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "src/com/bit/oop7/inout/data.txt";
		FileInputStream fileIn = null;
		DataInputStream dataIn = null;
		try {
			// 파일을 open 하기전 파일이 삭제 되었다.
			fileIn = new FileInputStream(fileName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			
			// 파일을 open 하는 과정에서 파일이 삭제되어
			// 예외가 발생하였다.
			// e.printStackTrace();
			System.out.println("파일을 열수 없습니다.");

		}
		
		dataIn = new DataInputStream(fileIn);

		int ch = 0;
		try {
			while ((ch = dataIn.read()) != -1) {
				if (ch == -1)
					break;
				System.out.println((char) ch);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
