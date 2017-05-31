package com.bit.swing.hello;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Hello05 {

	JFrame jFr = new JFrame();
	JPanel jPa = new JPanel();
	public Hello05(){
		jFr.setTitle("Border Layout 포함 Frame");
		jFr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jPa.setLayout(new BorderLayout());
//		jPa.setLayout(new FlowLayout());
		jPa.setBackground(Color.GREEN);
		JButton bt1 = new JButton("버튼1");
		JButton bt2 = new JButton("버튼2");
		JButton bt3 = new JButton("버튼3");
		
		jPa.add(bt1, "North");
		jPa.add(bt2,"Center");
		jPa.add(bt3, "South");
		
		jFr.add(jPa,"West");
		
		
		jFr.setSize(300, 500);
		jFr.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {

		new Hello05();
	}

}
