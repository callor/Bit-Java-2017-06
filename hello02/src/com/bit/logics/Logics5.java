package com.bit.logics;

public class Logics5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int intNum = 0;
		int intSum = 0;
		for(int intNum = 0 ;intNum < 11 ;intNum++ ) {
			
			// intNum = intNum + 1;
			// intNum += 1;
			// intNum++;
			
			//intSum = intSum + intNum ; // 누적연산
			intSum += intNum;
			
			System.out.println(intNum);
//			System.out.println("안녕하세요");
			
		}
		System.out.println("계산합:"+intSum);

	}

}
