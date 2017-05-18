package com.bit.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stream02 {

	public static void main(String[] args) {

		// 2017.png 파일을 2017_copy.png 파일로 카피
		String sourceFile = "src/com/bit/stream/2017.png";
		String targetFile = "src/com/bit/stream/2017_copy.png";
		
		FileInputStream fInput = null;
		FileOutputStream fOutput = null;
		
		try {
			fInput = new FileInputStream(sourceFile);
			fOutput = new FileOutputStream(targetFile);
			
			byte[] cart = new byte[1024];
			while(true){
				int ret = fInput.read(cart,0,cart.length) ;
				if(ret == -1) break; // 읽은 파일이 끝났으면 종료
				fOutput.write(cart);
			}
			fInput.close();
			fOutput.close();
			
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
