package com.bit.oop8.filewriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class KeyInWriter {

	public static void main(String[] args) {

		String fileName = "src/com/bit/oop8/filewriter/grade1.txt";
		
		Scanner scanner = new Scanner(System.in);
		PrintWriter pw =null ;
		
		try {
			pw = new PrintWriter(fileName);
			while(true){
				
				System.out.print("학번>>");
				String keyNum = scanner.nextLine();

				if(keyNum.equals("END--")) break;
				
				System.out.print("점수>>");
				String keyGrade = scanner.nextLine();
				
				try {
					int intGrade = Integer.valueOf(keyGrade);	

					pw.print(keyNum) ;
					pw.print(":");
					pw.println(keyGrade);

				} catch ( NumberFormatException e) {
					System.out.println("점수를 처리 할 수 없습니다");
				}
				
				
			}
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			pw.close();
			e.printStackTrace();
		}
		System.out.println("성적 저장이 완료되었습니다");
		
	}

}



