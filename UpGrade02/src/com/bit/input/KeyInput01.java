package com.bit.input;

import java.util.Scanner;

public class KeyInput01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자 1을 입력하세요");
		String keyin1 = scanner.nextLine();
		int num1 = Integer.valueOf(keyin1);
		
		System.out.println("숫자 2를 입력하세요");
		String keyin2 = scanner.nextLine();
		int num2 = Integer.valueOf(keyin2);
		
		System.out.println(num1 + num2);

	}
}
