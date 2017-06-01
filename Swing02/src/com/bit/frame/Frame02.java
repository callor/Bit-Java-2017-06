package com.bit.frame;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Frame02 {
	
	JFrame jFrame = new JFrame();
	public Frame02(){
		
		jFrame.setTitle("Login");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setLayout(new GridLayout(2,2));
		
		JLabel label01 = new JLabel("아이디");
		label01.setHorizontalAlignment(JLabel.RIGHT); // 오른쪽정렬
		JTextField txtId = new JTextField(10);
		
		JLabel label02 = new JLabel("비밀번호");
		JTextField txtPw = new JTextField(10);
		
		jFrame.add(label01);
		jFrame.add(txtId);
		jFrame.add(label02);
		jFrame.add(txtPw);

		jFrame.setSize(200,100);
		jFrame.pack();
		jFrame.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Frame02();
	}

}
