package com.bit.frame.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.bit.frame.controller.MemberDAO;

public class MemberList extends JFrame {
	MemberDAO dao = new MemberDAO();
	// swing table을 사용하기 위한 준비
	DefaultTableModel model ; // 데이터를 보여주기 위한 준비도구
	JTable jtable ; // 데이터를 보여주는 도구
	
	Vector<String> cols = new Vector<String>();
	Vector<MemberDAO> v ;
	static MemberList mList ;
	
	public MemberList(){
		setTitle("회원리스트");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// dao에서 전체 회원리스트 가져오기
		v =  dao.selectAll();
		cols= getColumnTitle();
		
		// List를 model에 포함시켜주는 도구
		model = new DefaultTableModel(v,cols);
		jtable = new JTable(model);
		JScrollPane jSC = new JScrollPane(jtable);
		add(jSC);
		
		
		// 회원등록 버튼 추가
		JPanel jp = new JPanel();
		JButton btnInsert = new JButton("회원등록");
		btnInsert.addActionListener(new BtnInsert());
		jp.add(btnInsert);
		add(jp,"North");
		
		setSize(500,200);
		setVisible(true);
	}
	
	class BtnInsert implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			new MemberJoin(mList);
		}
	}
	
	public void jTableRefresh(){
		DefaultTableModel model = new DefaultTableModel(dao.selectAll(),cols);
		jtable.setModel(model);
	}
	
	// 칼럼 제목 표시줄 생성
	public Vector getColumnTitle(){
		Vector cols = new Vector();
		cols.add("id");
		cols.add("사용자ID") ; // 표의 제목을 만들기 위한 list
		cols.add("비밀번호");
		cols.add("사용자명") ;
		cols.add("성별");
		cols.add("전화번호");
		return cols;
	}
	
	public static void main(String[] args) {

		mList = new MemberList();
//		mList = mList;
	}

}
