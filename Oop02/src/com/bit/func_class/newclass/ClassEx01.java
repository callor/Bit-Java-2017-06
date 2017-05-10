package com.bit.func_class.newclass;

public class ClassEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// NewClass 형태의 Object 영역을 예약
		//                  사용할 준비
		//                      |-> 생성자
		NewClass newClass1 = new NewClass();
		newClass1.view();
		
		NewClass newClass = new NewClass("삼각형");
		newClass.view();
	
		NewClass01 newClass01 = new NewClass01();
	
	}
	
	

}





