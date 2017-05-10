package com.bit.arrays;

public class Lotto2 {

	public static void main(String[] args) {

		int[] lotto = new int[45];
		for(int i = 0 ; i < lotto.length;i++){
			lotto[i] = i+1;
		}

		for(int i = 0 ; i < lotto.length;i++){
			for(int j = 0 ; j< lotto.length;j++){
				// 0 부터 44까지의 임의 수 2개생성
				int indexi = (int)(Math.random()*45);
				int indexj = (int)(Math.random()*45);
				if(indexi != indexj) {
					int t = lotto[indexi] ;
					lotto[indexi] = lotto[indexj] ;
					lotto[indexj] = t ;
				}
			}
		}
		
		for(int i = 0 ; i < 6; i++){
			System.out.print(lotto[i] + "\t");
		}
		System.out.println();
	}

}
