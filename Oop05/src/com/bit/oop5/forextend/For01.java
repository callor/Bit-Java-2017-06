package com.bit.oop5.forextend;

public class For01 {

	public static void main(String[] args) {
		
		// 1부터 100까지 표시를 하되
		// 10줄마다 다음줄에 표시되도록
		// 1 2 3 4 5 6 7 8 9 10
		// 11 12 13 14 ...
		for(int i = 0 ; i < 100 ; i++){
			System.out.print(i+1+"\t");
			if((i+1) % 10 == 0){ // 십진수 단위 검사
				System.out.println(); // 줄바꿈
			}
		}
		
		int line = 0 ;
		for(int i = 0 ; i < 10 ; i++){
			for(int j = 0 ; j < 10 ; j++){
				System.out.print(++line + "\t");
			}
			System.out.println();
		}
	}
}






