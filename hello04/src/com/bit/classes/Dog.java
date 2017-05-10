package com.bit.classes;

public class Dog {
	
	// member 변수
	private int intLeg = 4; // 다리 개수
	
	public void setIntLeg(int intLeg){
		if(intLeg != 4) {
			System.out.println("Dog의 다리는 반드시 4이어야 합니다");
		} else {
			this.intLeg = intLeg;	
		}
	}
	
	public int getIntLeg(){
		return intLeg;
	}
	
	public void whatLeg(){
		System.out.println(intLeg + "입니다");
	}

}
