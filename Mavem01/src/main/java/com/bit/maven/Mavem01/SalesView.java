package com.bit.maven.Mavem01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bit.maven.Mavem01.dbconfig.DbConfig;

public class SalesView {

	public static void main(String[] args) {

		try {
			Class.forName(DbConfig.DB_Driver);
			Connection conn = DriverManager.getConnection(
					DbConfig.DB_Url,
					DbConfig.DB_User,
					DbConfig.DB_Passwd);
			
			String sql = " SELECT sadate,satime,sabucode, buname FROM sales "
					+ " LEFT JOIN buyer "
					+ " ON sales.sabucode = buyer.bucode ; " ;
			
			PreparedStatement pSt = conn.prepareStatement(sql);
			ResultSet rs = pSt.executeQuery();
			while(rs.next()){
				System.out.print(rs.getString("sadate") + "\t");
				System.out.print(rs.getString("satime") + "\t");
				System.out.print(rs.getString("sabucode") + "\t");
				System.out.print(rs.getString("buname") + "\n");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
