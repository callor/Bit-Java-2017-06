package com.bit.oop7.inout;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class KeyInHangul {

	public static void main(String[] args) {

		InputStream ins = System.in ;
		// 한글을 키보드에서 입력하기 위해
		// 변환 파이프를 연결한다.
		InputStreamReader hKB = new InputStreamReader(ins);
		
		System.out.println("문자열을 입력하시오");
		int ch = 0 ;
		try {
			while((ch = hKB.read()) != -1){
				// Enter 키가 입력되면 종료
				if(ch == 13) break;
				System.out.println((char)ch);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
