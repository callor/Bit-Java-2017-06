package com.bit.oop5.parents;

import com.bit.oop5.exec.Cat;
import com.bit.oop5.exec.Dog;

public class AnimalExec {

	public static void main(String[] args){
		Dog dog = new Dog(); // Dog class를 dog instance로 선언
		
		// 외부 class에서 생성된 instance에서는 접근금지
//		dog.strName = "허스키";
//		dog.setStrName("허스키");
		
		dog.run();
		dog.setStrName("허스키");
		
		dog.run();

		Cat cat = new Cat(); // super 생성자 호출
		Cat cat1 = new Cat("고양이",10); // 맴버초기화 생성자 호출
		
		cat.run();
		cat1.run();
		

	}
	
}
