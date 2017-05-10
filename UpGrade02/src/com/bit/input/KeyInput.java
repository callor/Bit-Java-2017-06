package com.bit.input;

import java.util.Scanner;

public class KeyInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력장치로부터의 신호를 문자열로 바꾸는 클래스
		//      객체(변수)로 생성
		//                // 생성자를 필요로
		//                // 입력신호를 받는 System.in을 포함해야한다.
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		
		// Blocking 되었다. 진행이 멈추었다.
		String keyin = scanner.nextLine(); // 키보드 입력을 대기

		
		System.out.println(keyin);

	}
}







