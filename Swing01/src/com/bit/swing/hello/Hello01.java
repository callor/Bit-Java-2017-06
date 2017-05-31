package com.bit.swing.hello;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Hello01 {

	JFrame jFr = new JFrame();
	public Hello01(){
		jFr.setTitle("안녕하세요");
		jFr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("클릭하세요");
		JButton btn1 = new JButton("하단");
		JButton btn2 = new JButton("상단");
		JButton btn3 = new JButton("왼쪽");
		JButton btn4 = new JButton("오른쪽");
		
		
		jFr.add(btn,"Center");
		jFr.add(btn1,"South");
		jFr.add(btn2,"North");
		
		jFr.add(btn3,"West");
		jFr.add(btn4,"East");
		
		jFr.setSize(300,300);
		
		// 화면압축
		jFr.pack();
		
		jFr.setVisible(true);
	}
	
	public static void main(String[] args) {
		// 클래스의 생성자를 실행
		new Hello01();
	}

}
