package com.bit.swing.hello;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Hello04 {

	JFrame jFr = new JFrame();
	JButton bt1, bt2, bt3; // 버튼 3개를 사용할 준비
	
	public Hello04(){
		jFr.setTitle("Flow Layout 포함 Pane");
		jFr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// component를 순서대로 배치
		jFr.setLayout(new FlowLayout());
		
		bt1 = new JButton("첫번째 버튼");
		bt1.setEnabled(false);
		
		bt2 = new JButton("두번째 버튼");
		bt2.setOpaque(true);
		bt2.setForeground(Color.MAGENTA);
		bt2.setBackground(Color.YELLOW);
		bt2.addActionListener(new Bt2Click());
		
		bt3 = new JButton("세번째 버튼");
		bt3.addActionListener(new MyClick());
		
		jFr.add(bt1);
		jFr.add(bt2);
		jFr.add(bt3);
		
		jFr.setSize(500, 300);
		jFr.setVisible(true);
		
	}
	class Bt2Click implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(bt1.isEnabled()) {
				bt1.setEnabled(false);
			} else {
				bt1.setEnabled(true);
			}
		}
	}
	class MyClick implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			if(bt1.isVisible()){
				bt1.setVisible(false);
				bt2.setVisible(false);
			} else {
				bt1.setVisible(true);
				bt2.setVisible(true);
			}
		}
	}
	
	public static void main(String[] args) {
		new Hello04();
	}

}
