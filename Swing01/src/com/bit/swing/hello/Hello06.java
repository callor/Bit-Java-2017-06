package com.bit.swing.hello;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Hello06 {

	JFrame jFr = new JFrame();
	JPanel jPa = new JPanel();
	JButton[] btn = new JButton[10];
	
	public Hello06(){
		jFr.setTitle("Grid Layout");
		jFr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for(int i = 0 ; i < btn.length ; i++){
			btn[i] = new JButton((i+1) + "번째 버튼");
			btn[i].addActionListener(new MyClick());
			jPa.add(btn[i]);
		}
								// rows, cols
		jPa.setLayout(new GridLayout(3,5));
		
		jFr.add(jPa);
		jFr.setSize(500, 500);
		jFr.setVisible(true);
	}
	class MyClick implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Object obj = e.getSource(); // 눌린버튼이 누구인가 알고 있는 변수
			for(int i = 0 ; i<btn.length;i++){
				if(obj == btn[i]) {
					JOptionPane.showMessageDialog(jFr,btn[i].getText());
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Hello06();
	}

}
