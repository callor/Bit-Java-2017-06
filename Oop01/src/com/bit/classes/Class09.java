package com.bit.classes;

import java.util.ArrayList;

import com.bit.vo.BookVO;

public class Class09 {

	public static void main(String[] args) {

		ArrayList<BookVO> vos = new ArrayList<BookVO>();
		
		BookVO vo = new BookVO();
		vo.setStrTitle("자바야 놀자");
		vo.setStrAuthor("홍길동");
		vo.setIntPrice(20000);
		vo.setStrDate("2017-01-01");
		
		vos.add(vo);
		
		vo = new BookVO(); // 새로운 object를 생성
		vo.setStrTitle("윈도우 만세");
		vo.setStrAuthor("이몽룡");
		vo.setIntPrice(15000);
		vo.setStrDate("1999-01-01");
		
		vos.add(vo);
		
		for(int i = 0 ; i < vos.size(); i++){
			System.out.print(vos.get(i).getStrTitle() + "\t");
			System.out.print(vos.get(i).getStrAuthor() + "\t");
			System.out.print(vos.get(i).getIntPrice() + "\t");
			System.out.println(vos.get(i).getStrDate() );
		}
	}

}
