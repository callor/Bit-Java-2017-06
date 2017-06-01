package com.bit.frame;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FramePanel extends JFrame {


	JPanel jpn = new JPanel();
	JButton btnOk = new JButton("확인");
	public FramePanel(){
		// JFrame에서 만들어둔 method
		setTitle("Frame Panel"); // jFrame.setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 패널에 GridLayout을 적용
		jpn.setLayout(new GridLayout(2,2));
		
		// 레이블생성
		JLabel label01 = new JLabel("아이디");
		label01.setHorizontalAlignment(JLabel.RIGHT);
		//레이블을 패널에 추가
		jpn.add(label01);
		
		// id textbox생성
		JTextField txtId = new JTextField(10);
		//패널에 추가
		jpn.add(txtId);
		
		JLabel label02 = new JLabel("비밀번호");
		label02.setHorizontalAlignment(JLabel.RIGHT);
		// 패널에 추가
		jpn.add(label02);
		
		// pwd textbox 생성
		JTextField txtPw = new JTextField(10);
		// 패널에 추가
		jpn.add(txtPw);
		
		add(jpn,"West");
		add(btnOk,"East");
		
		setSize(200,100);
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FramePanel();
	}

}
