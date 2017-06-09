package com.bit.members.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.bit.members.controller.MemberDAO;
import com.mysql.fabric.xmlrpc.base.Member;

public class MemberList extends JFrame {

	// 다른 창과 MemberList 객체를 공유하기 위해서 생성
	static MemberList mList; // 빈 객체 생성
	MemberDAO dao; // 빈 객체 생성
	JTable jtable;

	public MemberList() {
		createUI();
	}

	// 화면을 그리는 메서드 별도 생성
	public void createUI() {
		setTitle("회원정보 보기");
		// 창을 여러개 사용할때는 EXIT_ON_CLOSE 대신 사용
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setDefaultLookAndFeelDecorated(true);

		dao = new MemberDAO(); // DAO 초기화, 생성
		// 실제데이터, 타이틀
		
		// DefaultTableMode을 상속해서
		// DbClick 했을때 Editing Mode로 진입되지 않도록 새로운 클래스 생성
		// DefaultTableModel class를 무명클래스로 재 정의
		DefaultTableModel model 
			= new DefaultTableModel(dao.selectAll(), getColumnTitle()){
			public boolean isCellEditable(int row, int column){
				return false;
			}
		};
			
		// 데이터모델(데이터관리자)을 jtable에 등록(연결)
		jtable = new JTable(model);
		jtable.addMouseListener(new TableMouseClick());

		JScrollPane pane = new JScrollPane(jtable);

		JPanel jpanel = new JPanel();
		JButton btnInsert = new JButton("회원등록");
		btnInsert.addActionListener(new BtnInsert());

		JButton btnUpdate = new JButton("회원수정");
		JButton btnDelete = new JButton("회원삭제");

		jpanel.add(btnInsert);
		jpanel.add(btnUpdate);
		jpanel.add(btnDelete);

		add(pane);
		add(jpanel, "South");

		setSize(500, 500);
		setLocationRelativeTo(null); // 창을 화면 중앙에 표시
		setVisible(true);
		pack();
	}



	public Vector getColumnTitle() {
		Vector colName = new Vector();
		colName.add("id");
		colName.add("user ID");
		colName.add("이름");
		colName.add("비밀번호");
		colName.add("성별");
		colName.add("전화번호");
		colName.add("chk");
		return colName;
	}

	// DB가 변경되었을때 화면 Table을 갱신하기 위한 method
	public void jtableRefresh() {
		dao = new MemberDAO();
		DefaultTableModel model = new DefaultTableModel(dao.selectAll(), getColumnTitle());
		jtable.setModel(model); // Table 갱신하는 method
	}

	public static void main(String[] args) {
		mList = new MemberList(); // mList변수를 초기화 시켜 놓는다
	}

	class TableMouseClick implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub

			if (e.getClickCount() == 2) { // 왼쪽버튼을 몇번 클릭했는지를 알려준 값
				// 현재
				int row = jtable.getSelectedRow();
				// row 위치에 있는 id 값
				int id = (int) jtable.getValueAt(row, 0);

				new MembersEditorForm(id);
//				 JOptionPane.showMessageDialog(jtable,
//						 e.getClickCount());

			}
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

	}

	class BtnInsert implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			new MemberInputForm(mList); // mList를 MemberInputForm에 전달
		}
	}
}
