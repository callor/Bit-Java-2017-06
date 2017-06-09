package com.bit.members.view;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MembersEditor extends JFrame {

	GridBagConstraints gc ;
	public MembersEditor(){

		setTitle("회원정보 입력");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		GridBagLayout gridBag = new GridBagLayout();
		setLayout(gridBag);
		
		gc = new GridBagConstraints();
		gc.fill = GridBagConstraints.BOTH; // pane 전체에 채워서 쓰기
		
//		gc.weightx = 1.0;
//		gc.weighty = 1.0;
		
//		gc.gridx = 0;
//		gc.gridy = 0;
//		gc.gridwidth = 1;
//		gc.gridheight = 1;

		JLabel  lbstxt = new JLabel("사용자 ID");
		setPos(lbstxt,0,0,1,1);
		
//		add(lbstxt,gc);
		
//		gc.gridx = 1;
//		gc.gridy = 0;
//		gc.gridwidth = 1;
//		gc.gridheight = 1;
		JTextField txtUserId = new JTextField(10);
		setPos(txtUserId,1,0,1,1);
		
//		add(txtUserId, gc);
		
//		gc.gridx = 0;
//		gc.gridy = 1;
//		gc.gridwidth = 1;
//		gc.gridheight = 1;
		
		lbstxt = new JLabel("이름");
		lbstxt.setHorizontalAlignment(JLabel.RIGHT);
		setPos(lbstxt,0,1,1,1);
		//		add(lbstxt,gc);
		
//		gc.gridx = 1;
//		gc.gridy = 1;
//		gc.gridwidth = 1;
//		gc.gridheight = 1;
		JTextField txtUserName = new JTextField(10);
		setPos(txtUserName,1,1,1,1);
//		add(txtUserName, gc);

//		gc.gridx = 2;
//		gc.gridy = 0;
//		gc.gridwidth = 1;
//		gc.gridheight = 1;
		lbstxt = new JLabel("메모");
		lbstxt.setHorizontalAlignment(JLabel.RIGHT);
		setPos(lbstxt,2,0,1,1);
//		add(lbstxt,gc);
		
//		gc.gridx = 3; // x 위치좌표
//		gc.gridy = 0; // y 위치좌표
//		gc.gridwidth = 1; // 앞에 있는 컴포넌트의
//		gc.gridheight = 2; // 왼쪽에 있는 컴포넌트의 2배만큼의 높이로 지정
		JTextField txtUserMemo = new JTextField(10);
		setPos(txtUserMemo,3,0,1,2);
//		add(txtUserMemo, gc);
		
//		gc.gridx = 0;
//		gc.gridy = 2;
//		gc.gridwidth = 1;
//		gc.gridheight = 1;
		lbstxt = new JLabel("비고");
		lbstxt.setHorizontalAlignment(JLabel.RIGHT);
		setPos(lbstxt,0,2,1,1);
//		add(lbstxt,gc);
		
		JTextField txtUserRem = new JTextField(10);
		setPos(txtUserRem,1,2,3,1);
//		add(txtUserRem, gc);		
		
		setSize(500,500);
		setVisible(true);
	}
	
	public void setPos(Component obj,
			int x, int y, int width, int height){
		gc.gridx = x; // x 위치좌표
		gc.gridy = y; // y 위치좌표
		gc.gridwidth = width; // 앞에 있는 컴포넌트의
		gc.gridheight = height; // 왼쪽에 있는 컴포넌트의 2배만큼의 높이로 지정
		
		add(obj,gc);
		
	}
	
	static public void main(String[] args){
		new MembersEditor();
		
	}
	
}
