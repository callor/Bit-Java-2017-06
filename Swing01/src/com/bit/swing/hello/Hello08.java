package com.bit.swing.hello;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Hello08 {

	JFrame jFr = new JFrame();
	
	JLabel jlabel1 = new JLabel("숫자1");
	JTextField txt1 = new JTextField(7); // 숫자1 입력
	
	JLabel jlabel2 = new JLabel("숫자2");
	JTextField txt2 = new JTextField(7); // 숫자2 입력
	
	JTextField txt3 = new JTextField(7); // 결과 출력
	
	public Hello08(){
		jFr.setTitle("TextField 연습");
		jFr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFr.setLayout(new FlowLayout());
		
		JButton btn = new JButton("덧셈");
		btn.addActionListener(new MyCalc());
		
		jFr.add(jlabel1);
		jFr.add(txt1);
		jFr.add(jlabel2);
		jFr.add(txt2);
		jFr.add(btn);
		jFr.add(txt3);
		
		jFr.setSize(500,100 );
		jFr.setVisible(true);
		
	}
	class MyCalc implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String s1 = txt1.getText(); // TextField에서 값 꺼내기
			String s2 = txt2.getText();
			
			int intSum = Integer.valueOf(s1); // 숫자로 바꾸기
				intSum += Integer.valueOf(s2); // 숫자로 바꾸어 더하기
			txt3.setText(Integer.toString(intSum)); // 문자로 바꾸어 출력
		}
	}
	
	public static void main(String[] args) {

		new Hello08();
		
	}

}
