package com.test.utils;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DBMetaData {

	static Connection con = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		con = ConnectionManager.getConnection();
		
		try {
			
			DatabaseMetaData metadata = con.getMetaData();
		    String dbprod=metadata.getDatabaseProductName();
		    int version=metadata.getDatabaseMajorVersion();
            ResultSet rs=metadata.getSchemas();
            System.out.println("Printing Schemas..");
            while(rs.next())
            {
            	 System.out.println(rs.getString(1));
            	 //System.out.println(rs.getString(2));
            }
            
            System.out.println("Printing Catalog..");
           rs=metadata.getCatalogs();
            while(rs.next())
            {
            	 System.out.println(rs.getString(1));
            }

            System.out.println("Printing Table types..");
            rs=metadata.getTableTypes();
            while (rs.next()) {
            	System.out.println(rs.getString(1));
			}

            System.out.println("Printing Table info of employees..");

            rs = metadata.getColumns(null, "hr", "employees","employee_id" );
            while (rs.next()) {
            	System.out.println(rs.getString("table_name"));
            	System.out.println(rs.getString("colomn_name"));
			}
            System.out.println(rs.next());
            
		    System.out.println(dbprod);
		    System.out.println(version);
		    
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
