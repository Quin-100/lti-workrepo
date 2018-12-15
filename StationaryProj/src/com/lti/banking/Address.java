package com.lti.banking;

import java.io.Serializable;

public class Address implements Serializable {

	private  String bldname;
	private  String street;
	private  String city;
	private  String pincode;
	
	public Address(String bldname, String street, String city, String pincode) {
		super();
		this.bldname = bldname;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}
	public Address() {
		super();
	}
	
	public String getBldname() {
		return bldname;
	}
	public void setBldname(String bldname) {
		this.bldname = bldname;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "Address [bldname=" + bldname + ", street=" + street + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	
}
