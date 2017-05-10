package com.bit.func_class.newclass;

public class NewClass {

	private String strName ;
	
	
	public NewClass(){
		
	}
	
	// 자동으로 생성되는 생성자 메서드
	// 매개변수가 있는 생성자를 만듦
	public NewClass(String strName){
		this.strName = strName; // 내부변수 this.strName 값을
								// 매개변수 strName 값으로 세팅
	}
	
	public void view(){
		System.out.println(this.strName);
	}
}
