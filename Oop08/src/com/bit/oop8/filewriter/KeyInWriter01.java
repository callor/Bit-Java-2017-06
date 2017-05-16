package com.bit.oop8.filewriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class KeyInWriter01 {

	public static void main(String[] args) {

		String fileName = "src/com/bit/oop8/filewriter/grade1.txt";
		Scanner scanner = new Scanner(System.in);
		PrintWriter pw = null;
		
		try {
			pw = new PrintWriter(fileName);
			int intNum = 1;
			
			while(true){
				System.out.println(intNum + "의 점수(종료:--0)>>");
				String keyGrade = scanner.nextLine();
				if(keyGrade.equals("--0")) break;
				
				try{
					int intGrade = Integer.valueOf(keyGrade);	

					pw.print(intNum);
					pw.print(":");
					pw.println(keyGrade);
					++intNum;
				
				} catch(NumberFormatException e) {
					System.out.println("점수가 잘못되었습니다");
					System.out.println(intNum + "의 점수를 다시 입력하세요");
				}
			}
			pw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("완료되었습니다");
		
	}

}
