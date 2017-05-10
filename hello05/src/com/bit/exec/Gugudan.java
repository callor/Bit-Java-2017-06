package com.bit.exec;

public class Gugudan {

	public static void main(String[] args) {

		int intDan = 5;
		for (int i = 1; i < 10; i++) {
			System.out.println(i + " 단");
			System.out.println("=========================");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "x" + j + "=" + (i * j));
			}
			System.out.println("=========================");
		}

	}

}
