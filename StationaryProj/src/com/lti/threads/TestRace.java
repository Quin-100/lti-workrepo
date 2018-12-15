package com.lti.threads;

public class TestRace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Racer r = new Racer(10);
		r.start();
		r.interrupt(); 
		
		Racer r1 = new Racer(1);
		r1.start();
		r1.interrupt(); 
		
		Runnable r15 = new RunnableRacer();
		Thread th = new Thread(r15);
		th.start();
		th.setName("RacerRunnable..");
		th.setPriority(10);
	}

}
