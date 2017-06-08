package com.bit.backimage;


import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ImagePanel extends JPanel {

	private Image backgroundImage;
	String fileName = "src/com/bit/backimage/2017.png";

	@SuppressWarnings("null")
	public ImagePanel() {
		
		try {
			backgroundImage = ImageIO.read(new File(fileName));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(backgroundImage, 0,0,300,300,null);
	}
}
