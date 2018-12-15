package com.lti.banking;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.tools.FileObject;

public class TestCitizen{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      
      Address address1=new Address("Pawna Heights","Poonam","Mumbai","401230");
      Address address2=new Address("Alex Heights","Ganesh","Pune","401231");
      Address address3=new Address("Agarwal Heights","Poonam","Mumbai","401232");
      Address address4=new Address("Baria Heights","MB Road","Agra","401233");     
      
   
      Citizen citizen1=new Citizen("2323 7898 3456","Ganesh Gaitonde",address1,LocalDate.of(2000, 06, 03)); 
      Citizen citizen2=new Citizen("7812 7890 4556","Bunty",address2,LocalDate.of(2000, 06, 03));
      Citizen citizen3=new Citizen("4395 7500 2400","Kukku",address3,LocalDate.of(2000, 06, 03));
      Citizen citizen4=new Citizen("2458 2896 3125","Isa",address4,LocalDate.of(2000, 06, 03));
      
      Citizen[] citizens= { citizen1 , citizen2 , citizen3 , citizen4};
      
      List<Citizen> citenList = new ArrayList<>();
      
      try(FileOutputStream fw = new FileOutputStream("C:\\\\citizens.txt");
    		  ObjectOutputStream oos = new ObjectOutputStream(fw);
    		  FileInputStream fis = new FileInputStream("C:\\\\citizens.txt");
    		  ObjectInputStream ois = new ObjectInputStream(fis);){
    	 // fw.write(citizen1);
    	  for(int i = 0 ; i<citizens.length ; i++) {
    		  oos.writeObject(citizens[i]);  
    	  }   	      	  
    	  int i = 0; 
    	  String line;
    	  
    	  while(true) {
    		  Citizen c1 = (Citizen) ois.readObject();
    		  citenList.add(c1);	 
    		  System.out.println(citenList);
    	  }   	     	  
    	  
    	  
      } catch(EOFException e) {
    	  System.out.println("File Ended reading");
      }
      catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
      }   
      catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}     
      /*finally {
    	  for(int a=0 ; a< citenList.size() ; a++) {
    		  System.out.println(citenList.get(a));
    	  }
      }*/
	}

}
