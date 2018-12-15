package com.lti.threads;

import java.util.Scanner;

public class TestChat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Message : ");
		String msg = sc.next();
		Sender s = new Sender(new Data("Processing.."));
		Sender s2 = new Sender(new Data(msg));
		
		new Thread(s2,"Sender..").start();
		
		Reciever r=new Reciever(new Data(msg));		
		
		new Thread(r,"Reciever..").start();
		System.out.println("All the threads are started..");
		
		
		
	}

}
