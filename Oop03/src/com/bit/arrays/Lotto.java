package com.bit.arrays;

public class Lotto {

	public static void main(String[] args) {

		int[] lotto = new int[6]; // 0으로 초기화된 배열 6개
		int pos = 0 ;
		
		while(pos < 6){

			int t = (int)(Math.random() * 45 + 1) ;
			int index = 0;
			for(; index < pos ; index++){
				if(lotto[index] == t) break;
			}
			if(index >= pos) {
				lotto[pos] = t;
				pos++;
			}
		}
		for(int i : lotto){
			System.out.print(i + "\t");
		}
		System.out.println();
	}

}
