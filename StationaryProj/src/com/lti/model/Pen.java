package com.lti.model;


public class Pen {
	
	private static int ctr;
	
	private int id;
	private String brand;
	private float price;
	private String color_of_ink;
	
	Pen()
	{
	  	this.id=101;
		this.brand="abc";
		this.price=30.0f;
		this.color_of_ink="blue";
	    setctr();
	}
	
	public Pen(int id,String brand,float price,String color_of_ink)
	{
		this.id=id;
		this.brand=brand;
		this.price=price;
		this.color_of_ink=color_of_ink;
	    setctr();
	}
	
	Pen(Pen p)
	{
	  	this.id=p.id;
		this.brand=p.brand;
		this.price=p.price;
		this.color_of_ink=p.color_of_ink;
	    setctr();
	}
	
	//getter methods
	public int getid()
	{
		return this.id;
	}
	public String getbrand()
	{
		return this.brand;
	}
	public float price()
	{
		return this.price;
	}
	public String getcolor_of_ink()
	{
		return this.brand;
	}
	public int getCtr() {
		return this.ctr;
	}
	
	
	//setter
	public void setid(int id)
	{
		this.id=id;
	}
	
	public void setbrand(String brand)
	{
		this.brand=brand;
	}
	
	public void setprice(float price)
	{
		this.price=price;
	}
	
	public void setcolor_of_ink(String color_of_ink)
	{
		this.color_of_ink=color_of_ink;
	}
	
	public void setctr() {
		this.ctr++;	
	}
	
	public String toString()
	{
		return "Id: "+this.id+"\n"
				+"Brand: "+this.brand+"\n"
				+"Price: "+this.price+"\n"
                +"Color: "+this.color_of_ink+"\n"
                +"Ctr Value : "+this.ctr;			
	}
	
	//non static inner class
	private class InkChanger {
		String new_color;
		
		void chgInk() {
			color_of_ink = this.new_color;			
		}
		
		public InkChanger(String new_color) {
			super();			
			setNew_color(new_color);			
		}
		
		public String getNew_color() {
			return color_of_ink;
		}
		
		public void setNew_color(String new_color) {
			color_of_ink = new_color;
		}

		@Override
		public String toString() {
			return "InkChanger [ ink new_color=" + getNew_color() + "]";
		}						
		
	}
	
	//static inner class
	private static class CounterTrack{
			static void display()
			{
				System.out.println(ctr);				
			}		
		}
	
	public static void main(String[] args) {
		Pen p1 = new Pen(12,"Pilot",4340,"blue");
		Pen p2 = new Pen(12,"Pilot",4340,"blue");
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p1.equals(p2));
		
		Pen.InkChanger inkchanger = p1.new InkChanger("red");//non static inner class object
		//inkchanger.chgInk();
		System.out.println(inkchanger);
		
		Pen.CounterTrack penct = new CounterTrack();//static inner class object
		penct.display();
	}
	
	public boolean equals(Object e) {
		Pen p = (Pen) e;
		if(
				this.id == p.id 
				&& this.brand.equals(p.brand)
				&& this.price == p.price 
				&& this.color_of_ink.equals(p.color_of_ink)
		) {
			return true;
		}
		else
			return false;
	}
	
	@Override
	public int hashCode()
	{
		int hash=19;
		hash+=  this.id + this.brand.hashCode() + this.price + this.color_of_ink.hashCode();		
		return hash;
	}
	
	
	
	
}
