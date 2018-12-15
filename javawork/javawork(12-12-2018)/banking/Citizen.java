package com.lti.banking;

import java.io.Serializable;
import java.time.LocalDate;

public class Citizen extends Person implements Serializable{

	private String adhar_id;
	private String name;
	private Address address;
	private LocalDate date;	
	
	public Citizen(String adhar_id, String name, Address address, LocalDate date) {
		super();
		this.adhar_id = adhar_id;
		this.name = name;
		this.address = address;
		this.date = date;
	}

	public Citizen() {
		super();
	}

	public String getAdhar_id() {
		return adhar_id;
	}

	public void setAdhar_id(String adhar_id) {
		this.adhar_id = adhar_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}	
	
	@Override
	public String toString() {
		return "Citizen [adhar_id=" + adhar_id + ", name=" + name + ", address=" +address + ", date=" + date + "]";
	}

	
	@Override
	public void eat() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub

	}

}
