package com.lti.threads;


public class Sender extends Thread {
	private Data data;
	
	public Sender(Data data) {
		super();
		this.data = data;
	}
	
	public void run() {
		synchronized (data) {
			System.out.println("Sender: Lets Chat.");			
			data.setMsg(data.getMsg());
			System.out.println("Sender: "+Thread.currentThread().getName());
			
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Interrupted..");
			}
			
			//data.setMsg("Sender : Good morning Infoknights..!!!");
			System.out.println("Sender: I sent "+data.getMsg());
			System.out.println("Sender: This is to inform all the villagers..over there..that i am done.");
			data.notifyAll();
		}
		
		
	}
}
