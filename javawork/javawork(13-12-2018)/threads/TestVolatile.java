package com.lti.threads;

public class TestVolatile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     VolatileDemo vdemo1=new VolatileDemo();
     
     IncrementThread t1=new  IncrementThread(vdemo1);
     t1.start();
     System.out.println(vdemo1.getX());
     IncrementThread t2=new  IncrementThread(vdemo1);
     t2.start();
     System.out.println(vdemo1.getX());
     IncrementThread t3=new  IncrementThread(vdemo1);
     t3.start();
     System.out.println(vdemo1.getX());
     IncrementThread t4=new  IncrementThread(vdemo1);
     t4.start();
     System.out.println(vdemo1.getX());
     
     DecrementThread d1 = new DecrementThread(vdemo1);
     DecrementThread d2 = new DecrementThread(vdemo1);
     DecrementThread d3 = new DecrementThread(vdemo1);
     DecrementThread d4 = new DecrementThread(vdemo1);
     d1.start();
     System.out.println(vdemo1.getX());
     d2.start();
     System.out.println(vdemo1.getX());
     d3.start();
     System.out.println(vdemo1.getX());
     d4.start();  
     System.out.println(vdemo1.getX());
		
	}

}
