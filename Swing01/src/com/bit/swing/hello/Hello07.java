package com.bit.swing.hello;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Hello07 {

	JFrame jFr = new JFrame();
	JPanel jPa = new JPanel();
	int[] money = {50000,10000,5000,1000,500,100,50,10,5,1};
	String[] mText = {"오만원","만원","오천원","천원",
				"500","100","50","10","5","1"};
	JTextField sMoney ;
	JTextField[] cMoney = new JTextField[money.length];
	
	public Hello07(){
		jFr.setTitle("무제");
		jFr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jPa.setLayout(null);
		
		JLabel jLa = new JLabel("금액");
		jLa.setHorizontalAlignment(JLabel.RIGHT); // 오른쪽 정렬
		jLa.setSize(50,20);
		jLa.setLocation(20, 20);
		jPa.add(jLa);

		sMoney = new JTextField(30); // 가로폭 30글자 정도 
		sMoney.setSize(100,20); // 입력박스의 크기
		sMoney.setLocation(100, 20);
		jPa.add(sMoney);		
		
		JButton btn = new JButton("계산");
		btn.setSize(70,20);
		btn.setLocation(210,20);
		btn.addActionListener(new MyCalc());
		jPa.add(btn);
		
		for(int i = 0 ; i<mText.length;i++){
			jLa = new JLabel(mText[i]); // 레이블 생성
			jLa.setHorizontalAlignment(JLabel.RIGHT); 
			jLa.setSize(50, 20);
			jLa.setLocation(50, 20*(i+3));
			jPa.add(jLa);
			
			cMoney[i] = new JTextField(20);
			cMoney[i].setSize(70,20);
			cMoney[i].setLocation(120,20*(i+3));
			jPa.add(cMoney[i]);
		}
		
		jFr.add(jPa);
		jFr.setSize(400, 300);
		jFr.setVisible(true);
	}
	class MyCalc implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String strMoney = sMoney.getText(); // TextField에 값을 가져오기
			if(strMoney.length() == 0) return ; 
			int intMoney = Integer.valueOf(strMoney); // 문자열을 정수로 변경
			int rs = 0 ;
			for(int i = 0 ;i<money.length;i++){
				rs = intMoney/money[i];
				cMoney[i].setText(Integer.toString(rs)) ;
				if(rs > 0) intMoney %= money[i] ;
			}
		}
	}
	
	public static void main(String[] args) {
		new Hello07();
	}

}
