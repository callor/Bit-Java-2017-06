package com.bit.alg;

public class PrimeNumber2 {

	public static void main(String[] args) {

		for(int i = 2;i < 1000;i++){
			
			int j = 2;
			for(; j < i ; j++) {
				if(i % j == 0) break ;
			}
			if( j >= i) {
				System.out.println(i+"는 소수입니다");
			} else {
				System.out.println(i + "는 소수가 아닙니다");
			}
		}
		

	}

}
