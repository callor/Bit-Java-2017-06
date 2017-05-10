package com.bit.func_class.newclass;

public class NewClass01 {
	
	String strName;
	
	/**
	 * 클래스를 디자인하면 
	 * 매개변수가 없는 생성자가 자동으로 만들어진다
	 */
	public NewClass01(){
		
	}
	
	/**
	 * 하지만, 매개변수가 있는 생성자를 만들거나,
	 * 특별한 용도의 생성자를 임의로 만들게 되면
	 * 
	 * 자동 생성자가 만들어지지 않는다.
	 * 
	 * 임의의 생성자를 만들경우, 
	 * 반드시 자동 생성자도 수동으로 만들어야 한다.
	 * @param strName
	 */
	public NewClass01(String strName){
		this.strName = strName;
	}

}
