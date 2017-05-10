package com.bit.logics;

public class Logics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum = 33 ;
		
		// 짝수인가 홀수인가
		int intC = intNum / 2; // 자동 형변환
		// 계산결과는 16.5인데 
		// 그 결과를 intC 정수형변수에 저장을 하면
		// 소수점 이하를 잘라내고 정수형 부분만 저장한다.
		// 16만 저장이 되는 결과
		
		// intC *2 한 값과 원래값 intNum 를 비교해서
		// 같으면 짝수
		// 다르면 홀수
		if( (intC*2) == intNum ) {
			System.out.println(intNum + "는 짝수 입니다");
		} else {
			System.out.println(intNum + "는 홀수 입니다");
		}
		

	}

}
