package com.bit.oop5.exec;

// Animals를 상속
public class Dog extends Animals {
	

	// Dog 생성자 작성
	public Dog(){
		// Animals에서 설정된 member에 접근 가능
		strName = "강아지"; // strName 값을 세팅
		
	}

	@Override
	public String toString() {
		return "Dog [strName=" + strName + ", intAge=" + intAge + "]";
	}
	
	
	
}
