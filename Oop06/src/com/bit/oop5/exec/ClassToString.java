package com.bit.oop5.exec;

import java.util.ArrayList;

public class ClassToString {

	public static void main(String[] args) {

//		System.out.println("Korea"); // Korea 문자열 표시
//		System.out.println("Korea".toString());
		
		String[] sk = new String[2];
		sk[0] = "Korea";
		sk[1] = "대한민국";
		
		// 배열 리스트 표시
		for(int i = 0 ; i < sk.length;i++){
			System.out.println(sk[i]);
		}
		
		System.out.println(sk.toString());
		
		ArrayList<String> sk1 = new ArrayList<String>();
		
		sk1.add("Korea");
		sk1.add("대한민국");
		
		System.out.println(sk1.toString());
		
		for(int i = 0 ; i < sk1.size();i++){
			System.out.println(sk1.get(i).toString()); 
		}
		
		int intNum = 30;
		Integer intNum1 = 30;
		System.out.println(intNum1.toString());
		
	}

}
