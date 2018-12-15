package com.lti.model.inheritance;

public enum CoverColor {
	
	Black (1000,"Mumbai"),
	Golden(100,"Chandigarh"),
	Rose_pink(50,"Pune"),
	White(100,"Hyderabad");
   
	int numsManufactured;	
	String city;
	
	CoverColor(int n,String city)
	{
		this.numsManufactured=n;
		this.city=city;	
		
	}

	public int getNumsManufactured() {
		return numsManufactured;
	}

	public void setNumsManufactured(int numsManufactured) {
		this.numsManufactured = numsManufactured;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}
