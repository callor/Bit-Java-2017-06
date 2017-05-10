package com.bit.oop4.exec;

import com.bit.oop4.dto.BookDTO;
import com.bit.oop4.vo.BookVO;

public class Exec02 {

	public static void main(String[] args) {

		BookDTO bookDTO = new BookDTO();
		
		BookVO vo = new BookVO();
		vo.setStrTitle("윈도우세상");
		vo.setStrAuthor("기남석");
		vo.setIntPrice(20000);
		// !!!
		System.out.println("첫번째");
		System.out.println(vo);
		
		
		
		
		
		
		
		
		bookDTO.getDto().add(vo);
		
		vo = new BookVO();
		vo.setStrTitle("자바의 정석");
		vo.setStrAuthor("남궁성");
		vo.setIntPrice(30000);
		
		System.out.println("두번째");
		System.out.println(vo);
		
		bookDTO.getDto().add(vo);
	
		System.out.println(bookDTO.toString());
		
		
	}

}
