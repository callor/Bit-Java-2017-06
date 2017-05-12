package com.bit.oop5.exec;

import com.bit.oop5.dto.CatDTO;

public class CatExec {

	public static void main(String[] args) {

		CatDTO cats = new CatDTO();
		Cat cat; // instance 변수 예약

		cat = new Cat();
		cat.setStrName("샴");
		cats.getCats().add(cat);
		
		cat.toString(); // Object -> Animial -> Cat 상속된
//		System.out.println(cat.toString());
		
		cat = new Cat("페르시안",5);
		cats.getCats().add(cat);
		
		cats.getCats().add(new Cat("뱅골",6));
		cats.getCats().add(new Cat("브리티시",3));
		cats.getCats().add(new Cat("레드들",5));
		cats.getCats().add(new Cat("메인쿤",2));
		cats.getCats().add(new Cat("버마즈",1));
		
		System.out.println(cats.toString());
		
		
	}

}
