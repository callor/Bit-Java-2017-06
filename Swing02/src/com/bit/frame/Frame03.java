package com.bit.frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Frame03 extends JFrame {

	JPanel jPan1 = new JPanel();
	
	public Frame03(){
	
		int lableAlign = JLabel.RIGHT;
		Color backColor = Color.LIGHT_GRAY;
		
		setTitle("회원가입");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel frmTitle = new JLabel("회원가입");
		
		// 폰트 생성
		Font font = new Font("Gulim",Font.BOLD,30);
		// 레이블에 적용
		frmTitle.setFont(font);
		frmTitle.setHorizontalAlignment(JLabel.CENTER);
		add(frmTitle,"North");
		
								// rows, cols
		jPan1.setLayout(new GridLayout(5,3));
		jPan1.setBackground(backColor);
		
		JLabel lbText = new JLabel("아이디",lableAlign);
		jPan1.add(lbText);
		JTextField txtId = new JTextField(10);
		Font txtFont = new Font("Gulim",Font.PLAIN,20);
		txtId.setFont(txtFont);
		
		jPan1.add(txtId);
		jPan1.add(new JLabel());
		
		lbText = new JLabel("이름",lableAlign);
		jPan1.add(lbText);
		JTextField txtName = new JTextField(10);
		txtName.setFont(txtFont);
		jPan1.add(txtName);
		jPan1.add(new JLabel());
		
		lbText = new JLabel("비밀번호",lableAlign);
		jPan1.add(lbText);
		JPasswordField txtPw = new JPasswordField(10);
		jPan1.add(txtPw);
		jPan1.add(new JLabel());
		
		lbText = new JLabel("비밀번호확인",lableAlign);
		jPan1.add(lbText);
		JPasswordField txtPw1 = new JPasswordField(10);
		jPan1.add(txtPw1);
		jPan1.add(new JLabel());
		
		lbText = new JLabel("성별",lableAlign);
		jPan1.add(lbText);
		
		// 라디오 버튼용 panel
		JPanel bGrp = new JPanel();
		
		// 라디오 버튼 생성
		JRadioButton rBtn1 = new JRadioButton("남자");
		rBtn1.setBackground(backColor);
		JRadioButton rBtn2 = new JRadioButton("여자");
		rBtn2.setBackground(backColor);
		
		// 2개의 라디오 버튼을 그룹으로 설정해주고
		ButtonGroup rGrp = new ButtonGroup();
		rGrp.add(rBtn1);
		rGrp.add(rBtn2);

		// 라디오버튼용 패널에 버튼을 추가
		bGrp.add(rBtn1);
		bGrp.add(rBtn2);
		bGrp.setBackground(backColor);
		// 각각의 라디오 버튼용 패널을 메인패널 추가
		jPan1.add(bGrp);
		jPan1.add(new JLabel());
		
		
		
		
		
		
		add(jPan1,"Center");
		
		// 화면중앙에 띄우기
		setLocationRelativeTo(null);
		setSize(500,700);
		pack();
		setVisible(true);
		
		
	}
	
	
	public static void main(String[] args) {
		new Frame03();
	}

}
