package com.test.jdbc.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.test.utils.ConnectionManager;

public class ProfileDemo {
	static Connection con;
	static PreparedStatement ps;
	static Statement st;
	static ResultSet res = null;
 public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	String query="insert into profile values(?,?,?)";
	con=ConnectionManager.getConnection();
	
	System.out.println("Enter id");
	int id=sc.nextInt();
	
	System.out.println("Enter Name");
	String nam=sc.next();
	
	System.out.println("Enter path of the image");
	String path=sc.next();
	
	FileInputStream fis;
	try {
		fis = new FileInputStream(path);
		ps=con.prepareStatement(query);
		ps.setInt(1, id);
		ps.setString(2,nam);
		ps.setBinaryStream(3, fis,fis.available());
		
		int retval=ps.executeUpdate();
		
		if(retval==1)
		{
			System.out.println("Profile Added....");
			
		}
		
	
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	String query1="select * from profile";
	try {
		
		st = con.createStatement();
		res = st.executeQuery(query1);
		int q =0 ;
		while(res.next())
		{
			q ++;
			System.out.println(res.getInt(1));
			System.out.println(res.getString(2));
			//System.out.println(res.getBlob(3));
			
			Blob blob = res.getBlob(3);
			InputStream in = blob.getBinaryStream();
			FileOutputStream out = new FileOutputStream("C:\\test"+q+".jpg");
			byte[] buff = new byte[4096];  // how much of the blob to read/write at a time
			int len = 0;

			while ((len = in.read(buff)) != -1) {
			    out.write(buff, 0, len);
			}
			
			
			//fos.write(res.getBlob(3));
			
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
