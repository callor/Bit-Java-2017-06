package com.bit.stream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Stream01 {

	public static void main(String[] args) {

		String fileName = "src/com/bit/stream/2017.png";
		
		FileInputStream fileInStream = null;
		DataInputStream dataInStream = null;
		
		// 파일을 읽기 위해 열기
		try {
			fileInStream = new FileInputStream(fileName);
			dataInStream = new DataInputStream(fileInStream);
			
			int ch = 0 ; // char ch
			while(true){
				// 파일로 부터 1 byte 값을 읽는 메서드
				// 한번 실행할때마다 다음다음으로 진행한다
				ch = dataInStream.read(); //  1 byte를 파일에서 읽고
				if(ch == -1) break ; // 파일의 끝을 만나면
				
				System.out.print(ch + "\t");
				// ch 값을 16진수로 변환시켜 보이기
				System.out.println(Integer.toHexString(ch));
			}
			dataInStream.close();
			fileInStream.close();
			
			
			
 		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}






