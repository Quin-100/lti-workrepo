package com.lti.threads;

public class IncrementThread extends Thread{

	VolatileDemo v=new VolatileDemo();
	
	
	public IncrementThread(VolatileDemo v) {
		super();
		this.v = v;
	}


	public void run()
	{
		v.increment();
		try {
		Thread.sleep(14000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}

