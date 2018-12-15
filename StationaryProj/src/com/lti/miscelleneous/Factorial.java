package com.lti.miscelleneous;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int no;
		int ans;
		System.out.println("Enter No: ");
		no = sc.nextInt();	
		
		ans=fact(no);		
		
		System.out.println("Factorial : "+ans);		
	}
	
	private static int fact(int n)
	{
		if (n==0) 
		{
			return 1;
		}
		else
		{			
		    return n*fact(n-1);	
		}
	}  
}


