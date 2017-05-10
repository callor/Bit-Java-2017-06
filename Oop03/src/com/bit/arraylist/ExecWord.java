package com.bit.arraylist;

import java.util.Scanner;

public class ExecWord {

	public static void main(String[] args) {

		ArrayWord arrayWord = new ArrayWord();
		for(int i = 0 ; i < 10 ; i++){
			arrayWord.viewWord();
			
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine(); // 키보드에서 입력받기
			
			if(input.equalsIgnoreCase(arrayWord.getStrWord())) {
				System.out.println("참 잘했어요");
			} else {
				System.out.println("아쉽네요");
				System.out.println(arrayWord.getStrWord());
			}
		}
		
	}

}
