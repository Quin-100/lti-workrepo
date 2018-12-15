package com.lti.model;

import java.util.Arrays;

public class TestPen {
	
	public static void main(String args[])
	{	
		
		//Pen p1 = new Pen();
		//System.out.println(p1);		
		//System.out.println("Value of Ctr : "+p1.getCtr());	
		
		Pen[] penarr = new Pen[5];
		for (int i = 0; i < penarr.length; i++) {
			penarr[i] = new Pen(123,"DW",500.00f,"blue");
		}
		
		for (int i = 0; i < penarr.length; i++) {
			System.out.println(penarr[i].toString()); 
		}
		int a = 10;
		int b = a++;
		int d=b;
		int c = ++a;
		System.out.println("b : "+b);

		System.out.println("d : "+d);
		System.out.println("c : "+c);
		
		/*
		penarr[0].setid(1234);
		penarr[0].setbrand("DW");
		penarr[0].setprice(500.00f);
		penarr[0].setcolor_of_ink("blue");
		*/
		/*for (int i = 0; i < penarr.length; i++) {
			System.out.println(Array.toString.(penarr[i]));
		}*/
		//String str1="akdkfd";
		//System.out.println(str1 instanceof String);
		
		swap(2,3);		
	}		
	
	public static void swap(int a, int b) {
		b = a + b;
		a = b-a;
		b = b-a;
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}
	
}
