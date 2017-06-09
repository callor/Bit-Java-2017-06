package com.bit.backimage;


import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageView extends JFrame {
	
	
	public ImageView(){

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel imageBack;
		imageBack = new ImagePanel("src/com/bit/backimage/2017.png");
		imageBack.setBounds(0, 0, 300, 300);
		add(imageBack);
		

		setSize(300,300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ImageView();
		

	}

}
