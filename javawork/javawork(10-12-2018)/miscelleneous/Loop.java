package com.lti.miscelleneous;

import java.time.LocalDate;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name[]= {"hitesh","anita"};
		for (String n :name)
		{
			System.out.println(n);
			
		}
		
		int ans=4+Integer.parseInt("2");
		System.out.println(ans);
		
		LocalDate date=LocalDate.of(2015, 12, 31);
		System.out.println(date);
		
	}

}
