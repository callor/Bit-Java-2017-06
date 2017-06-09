package com.bit.backimage;


import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * @author callor JFrame에는 배경이미지를 넣을 수 없어 JPanel을 상속받아 ImagePanel을 만든다.
 * 배경이미지와 이미지 크기를 생성자 인자로 받아 이미지를 읽고, 
 * 설치하고 JFrame에 add 하여 처리한다.
 *
 */
public class ImagePanel extends JPanel {

	private Image backgroundImage;
	private int x, y, width, height;

	public ImagePanel(String fileName) {
		try {
			backgroundImage = ImageIO.read(new File(fileName));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	// JPanel의 크기가 변할때 마다 자동으로 이미지 크기 변화
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
	}
}
