package com.lti.practice;

import java.util.StringTokenizer;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb1=new StringBuilder();
		sb1.append("This isanew string");
		System.out.println(sb1.length()+" is the length");
		System.out.println(sb1.capacity()+" is the capacity");		
		System.out.println(sb1.reverse()+" reverse");		
		sb1.ensureCapacity(100);

		System.out.println(sb1.capacity()+" is the capacity");	
		System.out.println(sb1.charAt(10));	
		
		System.out.println(sb1);
		
		String names = "Ina, mina, rina, tina";
		StringTokenizer st = new StringTokenizer(names, " ,");
		while(st.hasMoreElements()) {
			String token = (String) st.nextElement();
			System.out.println(token);
		}
		
		
		

	}

}
