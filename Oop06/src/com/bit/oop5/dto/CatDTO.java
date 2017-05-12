package com.bit.oop5.dto;

import java.util.ArrayList;

import com.bit.oop5.exec.Cat;

public class CatDTO extends Object {
	
	private ArrayList<Cat> cats = new ArrayList<Cat>();

	public ArrayList<Cat> getCats() {
		return cats;
	}

	public void setCats(ArrayList<Cat> cats) {
		this.cats = cats;
	}

	// ArrayList를 사용하는 DTO에서는 toString()을 재정의 하지 않는다
	
	
}




