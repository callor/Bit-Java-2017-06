package com.bit.logics;

public class Star0 {

	public static void main(String[] args) {

		// 별을 4각으로 찍기
		for(int i = 0 ; i < 10 ; i++){
			for(int j = 0 ; j < 10 ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// 별을 삼각으로 찍기
		for(int i = 0 ; i < 10 ; i++){
			for(int j = 0 ; j < i ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
