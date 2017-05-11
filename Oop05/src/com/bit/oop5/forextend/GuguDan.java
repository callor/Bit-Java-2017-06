package com.bit.oop5.forextend;

public class GuguDan {

	public static void main(String[] args) {

		for(int i = 2; i < 10 ; i++){
			System.out.printf("구구단 %d 단\t",i);
		}
		System.out.println();
		for(int i = 2; i < 10 ; i++){
			System.out.print("============\t");
		}
		System.out.println();
		for(int j = 1 ; j < 10 ;j++){
			for(int i = 2 ; i < 10 ;i++){
				System.out.printf("%d x %d = %d \t",i,j,i*j);
			}
			System.out.println();
		}
		for(int i = 2; i < 10 ; i++){
			System.out.print("============\t");
		}
		System.out.println();

		
	}

}
