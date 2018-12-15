package com.lti.threads;

public class DecrementThread  extends Thread{
	

	VolatileDemo v=new VolatileDemo();
	
	
	public DecrementThread(VolatileDemo v) {
		super();
		this.v = v;
	}


	public void run()
	{
		v.decrement();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Interrupted..");
		}
	}
}
