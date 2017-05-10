package com.bit.exec;

import com.bit.classes.Dog;

public class DogExec {

	public static void main(String[] args) {

		Dog dog = new Dog();
		System.out.println(dog.getIntLeg());
		
		// intLeg는 5가 될수 없다.
		// 
//		dog.intLeg = 5;
		dog.setIntLeg(5);
		System.out.println(dog.getIntLeg());
		
		dog.whatLeg();

		
		
	}
}
