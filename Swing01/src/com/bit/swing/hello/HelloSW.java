package com.bit.swing.hello;

import javax.swing.JFrame;

public class HelloSW {
	
	// 윈도우 생성, Container
	// 다른 Layout이나 Component를 포함하는 클래스(객체)
	JFrame jFrame = new JFrame();
	
	// 클래스 이름과 같은 method = 생성자
	public HelloSW(){
		
		// 윈도우 창 좌측에 보이는 제목(제목표시줄)
		jFrame.setTitle("Hello Swing");
		
		// 닫기 버튼 활성화
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 가로, 세로 창크기 설정
		jFrame.setSize(500, 300);
		
		// 창을 실행하라
		jFrame.setVisible(true);
		
	}

	public static void main(String[] args) {
		new HelloSW();
	}

}
