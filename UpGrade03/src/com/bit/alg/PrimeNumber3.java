package com.bit.alg;

public class PrimeNumber3 {

	public static void main(String[] args) {
		// 소수중에서 10001번째 소수가 얼마인가 ?
		int intMax = 1000000001;
		int count = 0;
		
		for(int i = 2;;i++){
			int j = 2;
			for(; j < i ; j++) {
				if(i % j == 0) break ;
			}
			if(j >= i) {
				// 소수를 찾은 부분
				count ++ ;
				if( count == intMax) {
					System.out.printf("%d 번째 소수는 %d 입니다",
							count,i);
					break; // i 를 끝내는 break
				}
			}
		}
	}
}




