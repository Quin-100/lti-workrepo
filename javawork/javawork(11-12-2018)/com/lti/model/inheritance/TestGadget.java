package com.lti.model.inheritance;

public class TestGadget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         MobilePhone m1=new MobilePhone("Android",8,CoverColor.Rose_pink);
 		//System.out.println(m1);
		/*m1.turnOn();
		m1.turnOff();
		*/
		Gadget g1=new Telivision(new Gadget(),54);
		Gadget g2=new MobilePhone("IOS",10,CoverColor.Golden);
		gadgetOn( g1);
		gadgetOff(g1);
		
		gadgetOn(g2);
		gadgetOff(g2);
		
		gadgetOn(m1);
		gadgetOff(m1);
		
		
	}
	
	public static void gadgetOn(Gadget g)
	{
		g.turnOn();
		
	}
	
	public static void gadgetOff(Gadget g)
	{
		g.turnOff();
		
	}
	

}
