package com.bit.oop4.dto;

import java.util.ArrayList;

import com.bit.oop4.vo.BookVO;

public class BookDTO {
	
	private ArrayList<BookVO> dto = new ArrayList<BookVO>();

	public ArrayList<BookVO> getDto() {
		return dto;
	}

	public void setDto(ArrayList<BookVO> dto) {
		this.dto = dto;
	}

	@Override
	public String toString() {
		return "BookDTO [dto=" + dto + "]";
	}
	
	

}
