package com.test.jdbc.demo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

import com.test.utils.ConnectionManager;

public class DBProcedure {
	 static int id = 0 ,sqre=0;
    static String ename = null;
	static float sal = 0.0f;
	static Connection conn ;
	//static Statement stmt;
	//static PreparedStatement ppd ;
	static CallableStatement csmt,csmt1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id :");
		int eid = sc.nextInt();
		System.out.println("Enter no :");
		int no = sc.nextInt();
		conn = ConnectionManager.getConnection();
		try {
			csmt = conn.prepareCall("{call empInfo(?,?,?)}");
			csmt1 = conn.prepareCall("{?=call sqr(?)}");
			
			csmt.setInt(1, eid);
			csmt.registerOutParameter(2,Types.VARCHAR );
			csmt.registerOutParameter(3,Types.FLOAT );
			csmt.execute();
			 
			ename = csmt.getString(2);
			sal = csmt.getFloat(3);
			
			System.out.println("Name : "+ename);
			System.out.println("Salary : "+sal);
			

			csmt1.setInt(2, no);
			csmt1.registerOutParameter(1, Types.INTEGER);
			//csmt1.registerOutParameter(2, Types.INTEGER);
			csmt1.execute();
			sqre = csmt1.getInt(1);
			System.out.println("Square : "+sqre);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//stmt1 = conn.prepareCall(sql)

		
	}

}
