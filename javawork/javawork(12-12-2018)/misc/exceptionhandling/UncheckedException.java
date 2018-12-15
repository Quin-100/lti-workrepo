package com.lti.misc.exceptionhandling;

import java.io.File;

public class UncheckedException {
	public static void main(String[] args) {
		try {
			int z = 50/0;
			//String s = null;
			//System.out.println(s.length());			
		}		
		catch(ArithmeticException e) {
			System.out.println("Why ...why whyy...are you doing this...you dumb...you cant divide by 0..!!!!");
		}
		catch(NullPointerException e) {
			System.out.println("Again..?? whyy...are you doing this...string value is not assigned...!!!!");
		}
		catch(Exception  e) {
			System.out.println("I know you wont get it....you dumb...!!!!");
		}
		finally {
			//System.out.println("you were gone no progress...leave it");
		}
		//System.out.println("By the way are you a human..");
		
	}
}
