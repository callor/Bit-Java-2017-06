package com.bit.swing.hello;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Hello02 {

	JFrame jFr = new JFrame();
	
	public Hello02(){
		jFr.setTitle("안녕하세요");
		jFr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("클릭해주세용");
		// 버튼을 클릭했을때 할일을 미리 지정해 주는것
		// 이벤트 핸들러 등록
		btn.addActionListener(new MyClick());
		jFr.add(btn,"Center");
		
		jFr.setSize(300,300);
		jFr.setVisible(true);
	}
	class MyClick implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// 다이알로그 Box
			JOptionPane.showMessageDialog(jFr, "버튼이 눌렸습니다");
		}
	}
	public static void main(String[] args) {
		new Hello02();
	}

}
