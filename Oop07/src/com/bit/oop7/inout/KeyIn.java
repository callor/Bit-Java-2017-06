package com.bit.oop7.inout;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class KeyIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		InputStream kb = System.in; // 키보드로 연결
		
		System.out.println("키보드로 KOREA를 입력하시오");
		int ch = 0 ;
		try {
			while((ch = kb.read()) != -1 ){
				if(ch == 13) break;
				System.out.println((char)ch);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("키보드에서 읽을 수 없습니다.");
		}

	}

}
