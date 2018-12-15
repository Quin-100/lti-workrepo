package com.lti.misc.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		try(FileReader fr = new FileReader("C:\\hello.txt"); 
				FileWriter fw = new FileWriter("C:\\helloTest1.txt");) {
			
			while((i = fr.read()) != -1) {
				System.out.println(i + ":" + (char) i);
				fw.write(i+"yo");
			}			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		try(FileInputStream fi = new FileInputStream("C:\\test.jpg"); 
				FileOutputStream fo = new FileOutputStream("C:\\test1.jpg");){
			while((i = fi.read()) != -1) {				
				fo.write(i);				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
