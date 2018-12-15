package com.lti.threads;

public class VolatileDemo {
	volatile int x;
	
	public VolatileDemo() {
		super();
		this.x = 100;
	}

	public void increment()
	{
		this.x= x += 10;		
	}
	
	public void decrement()
	{
		this.x=x -= 10;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	

	
	
}
