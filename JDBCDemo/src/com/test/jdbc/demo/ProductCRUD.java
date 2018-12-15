package com.test.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductCRUD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection connection = null;
		Statement stmnt = null;
		ResultSet result = null;
		int result1= 0;
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String uname="hr";
		String pass="hr";
		String query = " select * from Employees where ROWNUM <= 5";
		
		String query1="update Employees set first_name='Ram' where employee_id=101";
		//1.step : register driver class
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2. Get Connection Object
			connection = DriverManager.getConnection(url,uname,pass);
			//System.out.println(connection.toString());
			//3. Create statement object
			stmnt = connection.createStatement();
			//4. Execute statements
			result = stmnt.executeQuery(query);
			
			
			result1 = stmnt.executeUpdate(query1);
			System.out.println("Soo"+result1);
			
			/*while(result.next()) {
				int emp_id=result.getInt(1);
				String emp_first_name=result.getString(2);
				String emp_email=result.getString(4);
				String emp_no=result.getString(5);
				
				
				System.out.println(emp_id+"  "+emp_first_name+" "+emp_email+" "+emp_no);
				
			}*/
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
