package com.bit.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Stream00 {

	public static void main(String[] args) {

		String fileName = "src/com/bit/stream/2017.png";
		
		FileInputStream fileInStream = null;
		
		try {
			
			fileInStream = new FileInputStream(fileName);
			byte[] reader = new byte[fileInStream.available()];
			fileInStream.read(reader);
			
			int ch = 0;
			ch = fileInStream.read();
			
			System.out.println(reader);
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
