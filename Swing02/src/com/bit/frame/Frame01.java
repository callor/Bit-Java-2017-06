package com.bit.frame;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Frame01 {

	// JFrame 클래스를 이용해서 윈도우(pane) 객체생성
	JFrame jFrame = new JFrame();
	public Frame01(){
		// 창의 제목을 설정
		jFrame.setTitle("Swing 프로젝트");
		// x 버튼을 눌렀을때 창이 닫히도록 설정
		jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
		jFrame.setLayout(new FlowLayout());
		
		JLabel  jLabel = new JLabel("이름");
		jFrame.add(jLabel);
		
		JTextField txtBox = new JTextField(10);
		jFrame.add(txtBox);
		
		JButton btn = new JButton("확인");
		jFrame.add(btn);
		
		// 표시될 창의 크기 설정
		jFrame.setSize(300, 500);
		jFrame.pack();
		// 창을 표시하라
		jFrame.setVisible(true);
	}
	public static void main(String[] args) {
		// main에서는 현재 클래스의 생성자를 호출하는 부분만 작성
		// 클래스를 객체로 생성하지 않고, 생성자 method만 사용하는 방법
		new Frame01();
		
		Frame01 frame01 = new Frame01();
	}

}
