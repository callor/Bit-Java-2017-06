package com.bit.upgrade5.scope;

import java.sql.DriverManager;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println(NewClass.);
		
		NewClass newClass = new NewClass(); // 시작, 객체 탄생
		newClass.name = "홍길동";
		newClass = null ; // 임의로 객체를 소멸시킨다
//		newClass.name = "이몽룡";
		
		// 01의 시작
		NewClass newClass01 = new NewClass(); // 새로운 객체 탄생
		System.out.println(newClass01.name);
		newClass01.name = "이몽룡";
		System.out.println(newClass01.name);
		함수();
		
		// 새로운 01의 시작, 기존의 01은 소멸
		newClass01 = new NewClass();
		System.out.println(newClass01.name);
		
		StaticClass.name = "홍길동";
		함수1();
		System.out.println(StaticClass.name);
		
		StaticClass staticClass = new StaticClass();
		staticClass.name = "임꺽정";
		staticClass.test();
		
		System.out.println("홍길동");
//		Class.forName("");
//		DriverManager.getConnection("","","");
		
	}
	
	static void 함수(){
		
		// 새로운 newClass01 이 생성
		NewClass newClass01 = new NewClass(); 
		System.out.println("함수:"+newClass01.name);
		
	} // newClass01 소멸
	
	static void 함수1(){
		System.out.println("함수1:" + StaticClass.name);
		StaticClass.name = "성춘향";
		
	}

}
