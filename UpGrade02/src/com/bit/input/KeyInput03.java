package com.bit.input;

import java.util.Scanner;

public class KeyInput03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("몇단을 출력할까요?");
		int guguDan = Integer.valueOf(scanner.nextLine());
		
		System.out.println("구구단 : " + guguDan);
		System.out.println("===========================");
		for(int i = 1 ; i < 10; i++) {
			System.out.printf("%d x %d = %2d"
					,guguDan,i, guguDan * i);
		}

	}

}




