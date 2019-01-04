package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	private static  Connection connection=null;

	public ConnectionManager() {
		
	}
	
	public static Connection getConnection() {
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String uname="hr";
		String pass="hr";			
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(url,uname,pass);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		return connection;
	}				
	
	public static void main(String[] args) {
		connection = getConnection();
		System.out.println(connection);
	}
	
	
}
