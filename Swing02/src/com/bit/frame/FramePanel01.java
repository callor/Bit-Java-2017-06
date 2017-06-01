package com.bit.frame;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FramePanel01 extends JFrame {

	JPanel jpn = new JPanel();
	
	// 클릭이벤트 핸들러에서 접근할 수 있도록 scope를 변경
	// id textbox생성
	JTextField txtId = new JTextField(10);
	// 비밀번호감추기 필드
	JPasswordField txtPw = new JPasswordField(10);
	
	JButton btnOk = new JButton("로그인");
	JLabel message = new JLabel("message:");
	
	public FramePanel01() {

		setTitle("로그인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 패널에 GridLayout을 적용
		jpn.setLayout(new GridLayout(2, 2));

		// 레이블생성
		JLabel label01 = new JLabel("아이디");
		label01.setHorizontalAlignment(JLabel.RIGHT);
		// 레이블을 패널에 추가
		jpn.add(label01);


		// txtId를 패널에 추가
		jpn.add(txtId);

		JLabel label02 = new JLabel("비밀번호");
		label02.setHorizontalAlignment(JLabel.RIGHT);
		// 패널에 추가
		jpn.add(label02);

		// pwd textbox 생성
//		JTextField txtPw = new JTextField(10);

		// txtPw 패널에 추가
		jpn.add(txtPw);

		add(jpn, "West");
		add(btnOk, "East");
		
	
		//					폰트이름, 스타일, 크기
		Font font = new Font("Gulim",Font.ITALIC,20);
		message.setFont(font);
		
		add(message,"South");
		
		// 버튼이 눌렸을때 할일 지정
		btnOk.addActionListener(new BtnClick());
		
//		setSize(200, 100);
		pack();
		
//		setResizable(false); // 크기를 변경하지 마라
		setLocationRelativeTo(null); // 화면 중앙에 표시하라
		setVisible(true);
	}
	// inner Class : 클래스 내부에 클래스를 작성
	class BtnClick implements ActionListener {

		@SuppressWarnings("deprecation")
		@Override
		public void actionPerformed(ActionEvent e) {

			String msg = "아이디:"+txtId.getText() ;
			
			// 패스워드 필드에 입력된 값을 암호화
			msg += "/비밀번호:" + txtPw.getPassword();
			message.setText(msg);
			
		}
		
	}

	public static void main(String[] args) {
		new FramePanel01();
	}

}
