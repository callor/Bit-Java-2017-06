package com.bit.dbms.absclass;

// 기존의 견고한 class
public abstract class Pa01 {
	
	public void a(){
		System.out.println("A method");
	}
	
	public void b(){
		System.out.println("B Method");
	}
	
//	// 추상 메서드 생성
	public abstract void c();
	public abstract void d();

}
