package com.bit.oop5.exec;

import java.util.ArrayList;

public class ExecArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] aint = new int[10]; // 일반 자료형 변수 배열

		// 클래스 배열: 최초에는 빈 배열
		// 배열개수를 처음에 알수 없을때
		ArrayList<String> aString = new ArrayList<String>();
		aString.add("Korea");
		aString.add("대한민국");
		
		System.out.println(aString.toString());
		
//		ArrayList<int> aaInt = new ArrayList<int>(); // 오류
		ArrayList<Integer> aaInt = new ArrayList<Integer>();
	
//		ArrayList<float> aaFloat = new ArrayList<float>(); // 오류
		ArrayList<Float> aaFloat = new ArrayList<Float>();
		
//		ArrayList<boolean> aaBoolean = new ArrayList<boolean>(); // 오류
		ArrayList<Boolean> aaBoolena = new ArrayList<Boolean>();
	
	}

}




