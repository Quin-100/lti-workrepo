package com.lti.miscelleneous;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int no;
		int ans;
		System.out.println("Enter No: ");
		no = sc.nextInt();	
		
		prime(no);	
		
	}
	private static void prime(int n)
	{
		int res = 0;				
	    if(n < 4) res  = 0;
		for(int i=2 ; i<=n/2 ; i++ ) {
			if (n%i == 0) 
			{
				res ++;
				break;
			}
		}
		
		if(res == 0)
			System.out.println("No is prime");
		else
			System.out.println("No is not prime");
	}  
}
