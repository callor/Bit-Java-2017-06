package com.bit.backimage;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageTile extends JFrame {

	public ImageTile() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel imageBack;

		for (int i = 0; i < 5; i++) {
			imageBack = new ImagePanel("src/com/bit/backimage/2017.png");
			imageBack.setBounds(i*100, 0, 100, 100);
			add(imageBack);
		}

		setSize(1000, 1000);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ImageTile();
	}

}
