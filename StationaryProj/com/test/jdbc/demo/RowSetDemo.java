package com.test.jdbc.demo;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetDemo {
	static String url="jdbc:oracle:thin:@localhost:1521:xe";
	static String uname="hr";
	static String pass="hr";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JdbcRowSet rowset;
		try {
			rowset = RowSetProvider.newFactory().createJdbcRowSet();
			
			rowset.setUrl(url);
			rowset.setUsername(uname);
			rowset.setPassword(pass);
			
			rowset.setCommand("select first_name,salary from employees ");
			rowset.execute();
			while(rowset.next()) {
				System.out.println(rowset.getString(1));
				System.out.println(rowset.getFloat(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
