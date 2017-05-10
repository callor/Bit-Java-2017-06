package com.bit.values;

public class Logics {

	// 이 프로젝트의 최초로 실행되는 위치
	// 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intNum = 10;
		
		System.out.println(intNum > 10); // true
		System.out.println(intNum >= 20); // true
		System.out.println(intNum == 20); // true
		System.out.println(intNum < 30); // true
		System.out.println(intNum > 30); // false
		
		if(intNum>10) // 비교판단문
			System.out.println("맞아요"); // 비교가 true 일 경우만
		else
			System.out.println("아닌데요"); // false
		
		if(intNum > 10){
			int tmp = intNum * 10;
			System.out.println(tmp);
		} else {
			int tmp = intNum - 10;
			tmp = intNum + 10;
			tmp = intNum * 10;
			tmp = intNum / 10;
			System.out.println(tmp);
		}
		
		// tmp 변수는 {}를 벗어나면 사라(해제)진다.
//		System.out.println(tmp);
		
		if(intNum > 0) {
			
		} else {
			
		}

	}

}
