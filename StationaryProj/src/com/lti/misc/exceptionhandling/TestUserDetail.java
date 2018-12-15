package com.lti.misc.exceptionhandling;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lti.banking.Citizen;

public class TestUserDetail {
	
	 public static void main(String[] args) {
		 String name;
		 int age,sal;
		 List<UserDetails> userList = new ArrayList<>();		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter no of users :");
		 int no = sc.nextInt();
		 for(int i=0 ; i< no ; i++) {
			 System.out.println("Enter user name :");
			 name = sc.next();
			 System.out.println("Enter user age :");
			 age = sc.nextInt();
			 System.out.println("Enter user salary :");
			 sal = sc.nextInt();
			 UserDetails user = new UserDetails(name, age, sal);
			 userList.add(user);
		 }
		 
		 try(FileOutputStream osw = new FileOutputStream("C:\\userdetails.txt");
				 ObjectOutputStream oos = new ObjectOutputStream(osw);
				 FileInputStream fis = new FileInputStream("C:\\\\userdetails.txt");
	    		  ObjectInputStream ois = new ObjectInputStream(fis);){		 
			 
			 
			 for(int i = 0 ; i<userList.size() ; i++) {
	    		  oos.writeObject(userList.get(i));  
	    	  }			 
			 
			 userList.clear();
			 
			 while(true) {
				 
	    		  UserDetails user = (UserDetails) ois.readObject();
	    		  userList.add(user);	 	    		  
	    	  }   	  
			 
		 }
		 catch(EOFException e) {
	    	  System.out.println("File Ended reading");
	      }
		 catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		 
		 for(int a=0 ; a< userList.size() ; a++) {
   		  System.out.println(userList.get(a));
   	  }
		 
	}
	

}
