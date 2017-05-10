package com.bit.exec;

import com.bit.classes.MyClass;

public class Exec01 {

	public static void main(String[] args) {

		// class를 이용해서
		//      객체(object)를 생성
		//                    생성자
		MyClass myClass = new MyClass(); 
		int intSum = myClass.sum(10, 20);
		
		System.out.println(intSum);
		
		
		
		String strName = "홍길동";
		String strName1 = new String();
		String strName2 = new String("이몽룡");
		

	}

}
