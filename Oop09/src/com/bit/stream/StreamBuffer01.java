package com.bit.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamBuffer01 {

	public static void main(String[] args) {

		String sourceFile = "src/com/bit/stream/2017.png";
		String targetFile = "src/com/bit/stream/2017_copy1.png";
		
		FileInputStream fi = null;
		FileOutputStream fo = null;
		
		BufferedInputStream inBuffer = null;
		BufferedOutputStream outBuffer = null;
		
		try {
			fi = new FileInputStream(sourceFile);
			fo = new FileOutputStream(targetFile);
			
			inBuffer = new BufferedInputStream(fi);
			outBuffer = new BufferedOutputStream(fo);
						
			// 파일 크기 만큼의 카트 설정
			byte[] cart = new byte[inBuffer.available()];
			while(true) {
				int ch = inBuffer.read(cart);
				if(ch == -1) break;
				outBuffer.write(cart);
			}
			
			// buffer를 닫으면 파일 스트림도 닫힌다.
			inBuffer.close();
			outBuffer.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("복사가 완료 되었습니다");
		
		

	}

}
