package com.bit.oop7.inout;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput01 {

	public static void main(String[] args) {

		String fileName = "src/com/bit/oop7/inout/data.txt";
		
		try {
			FileInputStream  fileIn = new FileInputStream(fileName);
			DataInputStream dataIn = new DataInputStream(fileIn);
			
			int ch = 0 ;
			// 1 byte씩 읽어 들인다.
			while((ch =  dataIn.read()) != -1){
				if(ch == -1) break;
				System.out.print((char)ch);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("파일이 없습니다");
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("파일을 읽을 수 없습니다");
		}
		
		

	}

}
