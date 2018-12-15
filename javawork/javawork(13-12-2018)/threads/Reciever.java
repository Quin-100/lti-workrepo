package com.lti.threads;

public class Reciever extends Thread{

	private Data data;
	
	public Reciever(Data data) {
		super();
		this.data = data;
	}

	public void run() {
		System.out.println("Reciever: Hell yeahhh...lets begin..");
		System.out.println("Reciever: Waiting for data");
		System.out.println("Reciever: " +Thread.currentThread().getName());
		
		synchronized (data) {
			try {
				
				System.out.println("Reciever: Helllooo is any body there..??");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Interrupted....");
			}
		}	
		
		System.out.println("Reciever: Data Recieved..");
		System.out.println("Reciever: I recieved , "+data.getMsg());
	}
}
