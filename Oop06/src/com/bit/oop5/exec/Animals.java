package com.bit.oop5.exec;

public class Animals extends Object {
	
	// 상속 받은 child class에서만 제한적으로 접근하도록
	protected String strName;
	protected int intAge;
	
	
	
	public String getStrName() {
		return strName;
	}

	public void setStrName(String strName) {
		this.strName = strName;
	}

	public void run(){
		System.out.println(strName + "가 달립니다");
	}
	
	public void eat(){
		System.out.println(strName + "가 먹습니다");
	}
	
	public int getIntAge(){
		return this.intAge;
	}

	
}
