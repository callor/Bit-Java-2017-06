package com.bit.logics;

public class Logics3 {

	public static void main(String[] args) {

		int intNum = 33;
		
		if(intNum > 100) { // 1번조건
			System.out.println(intNum+"는 100보다 큽니다");
		} else if(intNum > 10) { // 1번조건이 true 가 아닌경우
			System.out.println(intNum + "는 10보다 큽니다");
		} else if(intNum > 0) {// 1, 2번조건이 모두 true가 아닌경우
			System.out.println(intNum + "는 0보다 큽니다");
		}
		// out
	
		if(intNum > 100) {
			System.out.println("100보다 크다");
		} else if(intNum > 90) {
			System.out.println("90보다 크다");
		} else if(intNum > 80) {
			System.out.println("80보다 크다");
		} else if(intNum > 70) {
			System.out.println("80보다 크다");
		} else if(intNum > 60) {
			System.out.println("80보다 크다");
		} else if(intNum > 50) {
			System.out.println("80보다 크다");
		}
		
	}

}
