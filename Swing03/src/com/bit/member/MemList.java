package com.bit.member;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MemList extends JFrame {
	
	static MemInsert mInsert = null ;
	public MemList(){
		
		setTitle("리플레시 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JButton btn01 = new JButton("새창열기");
		btn01.addActionListener(new BtnOpen());

		add(btn01);
		
		JTextField txt01 = new JTextField(10);
		add(txt01);
		
		setSize(500,500);
		setVisible(true);
		
	}
	class BtnOpen implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(mInsert == null) {
				mInsert = new MemInsert();	
			} else {
				mInsert.setVisible(true);
			}
		}
	}
	public static void main(String[] args){
		new MemList();
	}

}
