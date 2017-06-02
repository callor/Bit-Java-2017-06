package com.bit.frame.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MemberJoin extends JFrame {

	JPanel jPan1 = new JPanel();
	
	JTextField txtId = new JTextField(10); // 회원id
	JTextField txtName = new JTextField(10);
	JPasswordField txtPw = new JPasswordField(10);
	JPasswordField txtPw1 = new JPasswordField(10);
	JRadioButton rBtn1 = new JRadioButton("남자");
	JRadioButton rBtn2 = new JRadioButton("여자");
	JTextField txtTel = new JTextField(10);
	
	public MemberJoin(){
	
		int lableAlign = JLabel.RIGHT;
		Color backColor = Color.LIGHT_GRAY;
		
		setTitle("회원가입");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 회원가입 Title 표시부분
		JLabel frmTitle = new JLabel("회원가입");
		
		// 폰트 생성
		Font font = new Font("Gulim",Font.BOLD,30);
		// 레이블에 적용
		frmTitle.setFont(font);
		frmTitle.setHorizontalAlignment(JLabel.CENTER);
		add(frmTitle,"North");
		
		// Grid 크기 설정
								// rows, cols
		jPan1.setLayout(new GridLayout(9,3));
		jPan1.setBackground(backColor);
		
		
		jPan1.add(new JLabel());
		jPan1.add(new JLabel());
		jPan1.add(new JLabel());
		
		
		/********************************************
		 * id 입력창 설정
		 */
		JLabel lbText = new JLabel("아이디",lableAlign);
		jPan1.add(lbText);
		
		Font txtFont = new Font("Gulim",Font.PLAIN,20);
		txtId.setFont(txtFont);
		
		jPan1.add(txtId);
		jPan1.add(new JLabel());
		
		//============================================
		
		/*********************************************
		 * 이름 입력창 설정
		 */
		lbText = new JLabel("이름",lableAlign);
		jPan1.add(lbText);
		
		txtName.setFont(txtFont);
		jPan1.add(txtName);
		jPan1.add(new JLabel());
		//===========================================
		
		/********************************************
		 * 비밀번호 입력창
		 */
		lbText = new JLabel("비밀번호",lableAlign);
		jPan1.add(lbText);
		
		jPan1.add(txtPw);
		jPan1.add(new JLabel());
		
		/********************************************
		 * 비밀번호 확인 입력창
		 */
		lbText = new JLabel("비밀번호확인",lableAlign);
		jPan1.add(lbText);
		
		jPan1.add(txtPw1);
		jPan1.add(new JLabel());
		
		/*********************************************
		 * 성별 선택창 
		 */
		lbText = new JLabel("성별",lableAlign);
		jPan1.add(lbText);
		
		// 라디오 버튼용 panel
		JPanel bGrp = new JPanel();
		
		// 라디오 버튼 생성
		
		rBtn1.setBackground(backColor);
		
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
		
		//======================================================
		
		/*******************************************************
		 * 전화번호 입력창
		 */
		lbText = new JLabel("전화번호",lableAlign);
		jPan1.add(lbText);
		
		
		jPan1.add(txtTel);
		
		jPan1.add(new JLabel());

		
		/*******************************************************
		 * 회원가입 버튼
		 */
		
		JButton btnJoin = new JButton("가입");
		btnJoin.addActionListener(new JoinAction());
		
		jPan1.add(new JLabel());
		jPan1.add(btnJoin);
		jPan1.add(new JLabel());
		
		add(jPan1,"Center");
		
		// 화면중앙에 띄우기
		setLocationRelativeTo(null);
		setSize(500,700);
		pack();
		setVisible(true);
	}
	
	// 이벤트 핸들러 class, 버튼 이벤트를 처리하는 클래스
	class JoinAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			/***********************************
			 * 필수입력 항목이 입력되지않으면 메시지를 보여준다.
			 */
			// 회원 ID 를 입력하지 않았으면
			if(txtId.getText().isEmpty()) {
				JOptionPane.showMessageDialog(txtId, "회원ID는 필수항목입니다");
				txtId.requestFocus(true);
				return ;
			}
			// 이름을 입력하지 않았으면
			if(txtName.getText().isEmpty()){
				JOptionPane.showMessageDialog(jPan1, "이름은 필수항목입니다");
				txtName.requestFocus(true);
				return ;
			}
			if(txtPw.getText().isEmpty()){
				JOptionPane.showMessageDialog(jPan1, "비밀번호를 입력하세요");
				txtPw.requestFocus(true);
				return ;
			}
			if(txtPw1.getText().isEmpty()){
				JOptionPane.showMessageDialog(jPan1, "비밀번호 확인을 입력하세요");
				txtPw1.requestFocus(true);
				return ;
			}
			// 비밀번호입력과 확인 값이 서로 다르면
			if(!txtPw.getText().equals(txtPw1.getText())) {
				JOptionPane.showMessageDialog(jPan1, "비밀번호 값이 다릅니다 확인하세요");
				txtPw.setText(""); // TextFiel 내용을 삭제
				txtPw1.setText("");
				txtPw.requestFocus(true);
				return ;
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		new MemberJoin();
	}

}
