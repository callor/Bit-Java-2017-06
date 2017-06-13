package com.bit.bm.view;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.bit.bm.controller.MemberDAO;
import com.bit.bm.model.MemberDTO;

public class LoginPane extends JFrame {

	JTextField txtUserId = new JTextField(10);
	JTextField txtUserPasswd = new JTextField(10);
	
	public LoginPane(){
		setTitle("회원 로그인");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		// 로그인 Title 표시
		JLabel lbstitle = new JLabel("로그인");
		lbstitle.setFont(new Font("Gulim",Font.BOLD,25));
		lbstitle.setHorizontalAlignment(JLabel.CENTER);

		add(lbstitle,"North");
		
		
		// 패널을 하나 생성
		JPanel jpanel = new JPanel();
		// 패널 Layout Grid로 생성
		jpanel.setLayout(new GridLayout(2, 3));
		
		// 회원 ID Label을 만들고
		JLabel lbstxt = new JLabel("회원ID");
		lbstxt.setHorizontalAlignment(JLabel.RIGHT);
		
		// label 추가
		jpanel.add(lbstxt);
		// userId 입력박스 추가
		jpanel.add(txtUserId);
		// 빈 레이블 추가해서 오른쪽 여백주기
		jpanel.add(new JLabel(""));
		
		// 비밀번호 Label 만들고
		lbstxt = new JLabel("비밀번호");
		lbstxt.setHorizontalAlignment(JLabel.RIGHT);
		
		// 레이블 추가
		jpanel.add(lbstxt);
		// 비밀번호 입력박스 추가
		jpanel.add(txtUserPasswd);
		// 빈 레이블 추가해서 오른쪽 여백주기
		jpanel.add(new JLabel(""));

		// 패널을 현재창 센터에 추가
		add(jpanel,"Center");
		
		// 로그인 버튼 추가
		JButton btnLogin = new JButton("로그인");
		btnLogin.addActionListener(new BtnLogin());
		add(btnLogin,"South");
	
		setSize(300,300);
		setLocationRelativeTo(null);
		setVisible(true);
		pack();
	}
	
	class BtnLogin implements ActionListener {

		MemberDAO dao = new MemberDAO();
		@Override
		public void actionPerformed(ActionEvent e) {

			if(txtUserId.getText().isEmpty()) {
				JOptionPane.showMessageDialog(txtUserId, "사용자 ID를 입력하세요");
				txtUserId.setRequestFocusEnabled(true);
				return;
			}
			if(txtUserPasswd.getText().isEmpty()) {
				JOptionPane.showMessageDialog(txtUserPasswd, "비밀번호를 입력하세요");
				txtUserPasswd.setRequestFocusEnabled(true);
				return;
			}
			
			if(dao.loginCheck(txtUserId.getText()) == 0){
				JOptionPane.showMessageDialog(txtUserId, "사용자 ID가 없습니다");
				txtUserId.setRequestFocusEnabled(true);
				return;
			}
			
			MemberDTO dto = dao.loginCheck(txtUserId.getText(), txtUserPasswd.getText());
			if(dto == null){ // id와 passwd가 일치한 사람이 없는 경우
				JOptionPane.showMessageDialog(txtUserId, "아이디와, 비밀번호를 확인하세요");
				txtUserId.setText(""); // 입력박스 clear
				txtUserPasswd.setText("");
				return ;
			}
			
			String msg = dto.userId + "\n" ;
			msg += dto.userName + "\n";
			msg += dto.userTel + "\n";
			
//			JOptionPane.showMessageDialog(txtUserId, msg + "님 로그인을 환영합니다");
			if(dto.userGrade == 0){
				JOptionPane.showMessageDialog(txtUserId, "최고 관리님 로그인을 환영합니다");
			} else if(dto.userGrade < 2 ) {
				JOptionPane.showMessageDialog(txtUserId, "일반 관리자님 로그인을 환영합니다");
			} else if(dto.userGrade < 4 ) {
				JOptionPane.showMessageDialog(txtUserId, "VVIP 회원님 로그인을 환영합니다");
			} else {
				JOptionPane.showMessageDialog(txtUserId, Integer.valueOf(dto.userGrade) + "VIP 회원님 로그인을 환영합니다");
			}
			
			
		}
	}
	
	
	public static void main(String[] args) {
		new LoginPane();
	}

}
