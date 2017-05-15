package com.bit.oop7.inout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class KeyInBuffer {

	public static void main(String[] args) {

		InputStream ins = System.in;
		InputStreamReader  kb = new InputStreamReader(ins);
		BufferedReader buffer = new BufferedReader(kb);
		
		
		try {
			
			System.out.print("이름을 입력하시오>>");
			String strName = buffer.readLine();
			
			System.out.print("나이를 입력하시오>>");
			String strAge = buffer.readLine();
			int intAge = Integer.valueOf(strAge);
			
			System.out.printf("귀하는 %s 이고, 나이는  %d 입니다 ",
					strName,intAge);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
