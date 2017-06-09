package com.bit.members.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.bit.members.controller.MemberDAO;
import com.bit.members.dto.MemberDTO;

public class MembersEditorForm extends JFrame {

	// userID, userName, pass1, pass2, userSex, userTel
	String[] lbsStr = new String[]{
			"회원ID",
			"회원이름",
			"비밀번호",
			"비밀번호확인",
			"성별",
			"전화번호"
	};
	JLabel[] lbstxt ; //  = new JLabel[6];
	JTextField[] txtBox ; // = new JTextField[6];
	
	GridBagConstraints gc;
	
	int auto_id ;
	public MembersEditorForm(){
		
	}
	
	public MembersEditorForm(int id) {
		
		auto_id = id;
		setTitle("회원정보입력");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(new GridBagLayout());
		gc = new GridBagConstraints();
		gc.fill = GridBagConstraints.BOTH; 
//		gc.fill = GridBagConstraints.EAST;
		lbstxt = new JLabel[lbsStr.length];
		txtBox = new JTextField[lbsStr.length];
		
		// id값으로 수정할 데이터 1개 추출
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = dao.selectByid(id);
		
		for(int i = 0 ; i < lbsStr.length;i++){
			lbstxt[i] = new JLabel(lbsStr[i]);
			// Label글자를 오른쪽 정렬
			lbstxt[i].setHorizontalAlignment(JLabel.RIGHT);
			txtBox[i] = new JTextField(10);
			
			gc.gridx = 0;
			gc.gridy = i;
			add(lbstxt[i],gc);
			
			gc.gridx = 1;
			gc.gridy = i;
			add(txtBox[i],gc);
		}
		
		txtBox[0].setText(dto.getUserID());
		txtBox[1].setText(dto.getUserName());
		txtBox[2].setText(dto.getUserPasswd());
//		txtBox[3].setText(dto.getUserPasswd();
		txtBox[4].setText(dto.getUserSex());
		txtBox[5].setText(dto.getUserTel());
		
		JButton btnSave = new JButton("저장");
		btnSave.addActionListener(new BtnSave());
		
		gc.gridx = 1;
		gc.gridy = 6;
		add(btnSave,gc);
		
		setSize(300,300);
		setVisible(true);
	}
	
	class BtnSave implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			MemberDTO dto = new MemberDTO();
			dto.setId(auto_id);
			dto.setUserID(txtBox[0].getText());
			dto.setUserName(txtBox[1].getText());
			dto.setUserPasswd(txtBox[2].getText());
			dto.setUserSex(txtBox[4].getText());
			dto.setUserTel(txtBox[5].getText());
			
			MemberDAO dao = new MemberDAO();
			dao.update(dto);
			
		}
		
	}
	
	static public void main(String[] args){
		new MembersEditorForm();
	}
	
}
