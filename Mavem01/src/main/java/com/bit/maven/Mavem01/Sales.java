package com.bit.maven.Mavem01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.bit.maven.Mavem01.dbconfig.DbConfig;

import sun.util.resources.cldr.ar.CalendarData_ar_LB;

public class Sales {

	public static void main(String[] args) {
		try {
			Class.forName(DbConfig.DB_Driver);
			Connection conn = DriverManager.getConnection(DbConfig.DB_Url, DbConfig.DB_User, DbConfig.DB_Passwd);

			String sql = " SELECT count(*) FROM buyer ";
			PreparedStatement pSt = null;

			pSt = conn.prepareStatement(sql);
			ResultSet rs = pSt.executeQuery(); // 1줄 1개의 결과

			// 결과가 1줄뿐 이므로 while로 묶지 않아도 된다.
			// while(rs.next()){
			// recCount = rs.getInt(1));
			// };
			rs.next();
			int recCount = rs.getInt(1);
			
			// 1부터 레코드 개수 범위내의 임의의 ID값을 생성
			int getId = (int)(Math.random()*recCount + 1);
			
			// 임의로 생성된 ID를 이용해서 buyer레코드 1개를 추출
			sql = " SELECT * FROM buyer WHERE id = ? ";
			pSt = conn.prepareStatement(sql);
			pSt.setInt(1, getId);
			rs = pSt.executeQuery();
			
			rs.next();
			System.out.println(rs.getInt("id"));
			System.out.println(rs.getString("bucode"));
			System.out.println(rs.getString("buname"));
			System.out.println(rs.getString("butel"));
			System.out.println(rs.getString("buaddr"));
			
			String saleSQL = " INSERT INTO sales (sadate,satime,sabucode) "
					+ " values(?,?,?) ;";
			pSt = conn.prepareStatement(saleSQL);
			
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
			SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:dd");
			
			pSt.setString(1,dateFormat.format(cal.getTime())); // 현재 날짜 세팅
			pSt.setString(2,timeFormat.format(cal.getTime())); // 시간 세팅

			pSt.setString(3, rs.getString("bucode"));
			pSt.executeUpdate();
			System.out.println("추가 성공");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
