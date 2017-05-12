package com.bit.oop5.exec;

import java.util.ArrayList;

public class ClassToString02 {

	public static void main(String[] args) {

		Dog dog = new Dog();
		System.out.println(dog.toString());
		
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		
		dogs.add(dog);
		dogs.add(dog);
		dogs.add(dog);
		
		String s = dogs.toString();
		System.out.println(dogs.toString());
		
		
	}

}
