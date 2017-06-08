package com.bit.members.view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.bit.members.controller.MemberDAO;
import com.bit.members.dto.MemberDTO;

public class MemberInputForm extends JFrame {

	MemberList mList ;
	static MemberInputForm mForm;
	
	JPanel jform = new JPanel();
	JTextField txtId = new JTextField();
	JTextField txtName = new JTextField();
	JTextField txtPasswd = new JTextField();
	JTextField txtPasswdOk = new JTextField();
	
	public MemberInputForm(){
		createUI();
		
	}
	
	public MemberInputForm(MemberList mList){
		this.mList = mList; // this.mList를 만들어 놓는다.
		createUI();
	}
	
	
	public void createUI(){
		setTitle("회원등록");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		// 화면 중간에 제목 표시하기 
		JPanel jpanel = new JPanel();
		jpanel.setLayout(new BorderLayout());
		JLabel jtitle = new JLabel("회원정보입력");

		// 제목 글자크기 변경
		jtitle.setFont(new Font("Gulim",Font.BOLD,20));
		jtitle.setHorizontalAlignment(JLabel.CENTER);
		jpanel.add(jtitle);
		add(jpanel,"North");
		

										// 생성할때 주의
		BoxLayout boxLayout = new BoxLayout(jform,BoxLayout.Y_AXIS);
		jform.setLayout(boxLayout);
		
		JLabel libtxt = new JLabel("사용자 ID");

		
		jform.add(libtxt);
		jform.add(txtId);
		
		libtxt = new JLabel("이름");
		
		
		jform.add(libtxt);
		jform.add(txtName);

		libtxt = new JLabel("비밀번호");
	
		
		jform.add(libtxt);
		jform.add(txtPasswd);

		libtxt = new JLabel("비밀번호 확인");
	
		
		jform.add(libtxt);
		jform.add(txtPasswdOk);
		
		JButton btnSave = new JButton("등록");
		btnSave.addActionListener(new BtnSave());
		
		add(jform,"Center");
		add(btnSave,"South");
		
		setSize(300,300);
		setLocationRelativeTo(null);
		setVisible(true);
//		pack();
		
		
	}
	
	class BtnSave implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			// 저장
			// 입력값 확인
			if(txtId.getText().isEmpty()) {
				JOptionPane.showMessageDialog(jform, "아이디가 없습니다");
				txtId.requestFocus(true);
				return ;
			}
			MemberDTO dto = new MemberDTO();
			// DTO에 값 복사해 넣기
			dto.setUserID(txtId.getText());
			dto.setUserPasswd(txtPasswd.getText());
			dto.setUserName(txtName.getText());
			
			// DAO에 insert 만들고 DTO 넘겨주고 쿼리실행
			MemberDAO dao = new MemberDAO();
			if(dao.insert(dto)>0) {
				JOptionPane.showMessageDialog(jform, "데이터가 정상적으로 추가 되었습니다");
				mList.jtableRefresh();
				dispose(); // 현재창 닫기
			};
		}
	}
	
	
	public static void main(String[] args) {
		mForm = new MemberInputForm();
	}

}
