package com.bit.alg;

public class PrimeNumber1 {

	public static void main(String[] args) {
		
		for(int i = 2;i < 1000;i++){
		
			// break에 의해 중단되면 0 이외의 값을 갖는다
			int isPrime = 0 ;
			for(int j = 2; j < i ; j++) {
				if(i % j == 0) {
					isPrime = i;
					break ;
				}
			}
			// for 반복문이 모두 정상 종료되면 isPrime 은 0으로 유지
			if( isPrime == 0 ) {
				System.out.println(i+"는 소수입니다");
			} else {
				System.out.println(i + "는 소수가 아닙니다");
			}
		}
		

	}

}
