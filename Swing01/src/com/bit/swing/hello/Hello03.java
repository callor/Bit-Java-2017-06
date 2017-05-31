package com.bit.swing.hello;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Hello03 {

	JFrame jFr = new JFrame();
	public Hello03(){
		jFr.setTitle("버튼클릭");
		jFr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn1 = new JButton("North");
		btn1.addActionListener(new NorthClick()); // 무명, 익명 클래스
		
		JButton btn2 = new JButton("South");
		SouthClick sc = new SouthClick();
		btn2.addActionListener(sc);
		
		jFr.add(btn1,"North");
		jFr.add(btn2, "South");
		
		jFr.setSize(300, 500);
		jFr.setVisible(true);
		
	}
	class NorthClick implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(jFr, "North 버튼 클릭");
		}
	}
	class SouthClick implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(jFr, "South 버튼 클릭");
		}
	}
	
	public static void main(String[] args) {

		new Hello03();
	}

}
