package com.bit.input;

import java.util.Scanner;

public class KeyInput04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		// prompt, 명령대기
		System.out.print("숫자>>");
		String keyin = scanner.nextLine();
		int keyNum = Integer.valueOf(keyin);
		System.out.println((keyNum*keyNum) + "입니다");

	}

}
