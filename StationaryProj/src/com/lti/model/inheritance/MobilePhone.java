package com.lti.model.inheritance;

public class MobilePhone extends Gadget{
 
	private  String  brand;
	private int os;
	private CoverColor covercolor;
	
	
	
	@Override
	public String toString() {
		return "MobilePhone [brand=" + brand + ", os=" + os + ", covercolor=" + covercolor + "]";
	}
	public MobilePhone(String brand, int os, CoverColor covercolor) {
		super();
		this.brand = brand;
		this.os = os;
		this.covercolor = covercolor;
	}
	public CoverColor getCovercolor() {
		return covercolor;
	}
	public void setCovercolor(CoverColor covercolor) {
		this.covercolor = covercolor;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getOs() {
		return os;
	}
	public void setOs(int os) {
		this.os = os;
	}
	public void turnOn() {
		init();
		System.out.println("Welcome to android Oreo");
		displaylogo();
		playMusic();
		
		
		
	};
	
	private static void displaylogo()
	{
		System.out.println("Displaying logo");
		
		
	}
	
	private static void playMusic()
	{
		System.out.println("play music");
		
		
	}
	
	private static void init()
	{
		System.out.println("initialized ........");
		
		
	}
	
	
	public void turnOff() {
		
		closeallapps();
		
		
	};
	
	public static void closeallapps()
	{
		System.out.println("Shutting down");
		
	}
	
	

}
