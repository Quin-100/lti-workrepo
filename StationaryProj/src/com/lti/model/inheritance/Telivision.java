package com.lti.model.inheritance;

public class Telivision extends Gadget {
	
	private  int  screenSize;
	private int channelNumber;
	private boolean maxScreen;
	
	 Telivision(Gadget g,int screenSize) {
		// TODO Auto-generated constructor stub
		this.manufacturer=g.manufacturer;
		this.yom=g.yom;
		this.price=g.price;
		this.screenSize=screenSize;
		
	}
	
	public void turnOn()
	{
		int chNum=101;
		changeChannel(chNum);
	    maxScreen();	
	    System.out.println("Connecting TV......");
		
	}
	
	public  void changeChannel(int channelNumber)
	{
		  
		this.channelNumber=channelNumber;
		
	}
	private  void maxScreen()
	{
		   maxScreen=true;		
	}
	
	public void turnOff()
	{
		this.changeChannel(0);
		this.maxScreen=false;	
		System.out.println("Shuting down TV......");
	}
	
	
	
	

}
