package com.lti.model;

import javax.persistence.Embeddable;

@Embeddable
public class SchoolDetail {
	private String address;
	private int studentcount;
	private String publicschool;
	
	public SchoolDetail() {
		super();
	}
	
	public SchoolDetail(String address, int studentcount, String publicschool) {
		super();
		this.address = address;
		this.studentcount = studentcount;
		this.publicschool = publicschool;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getStudentcount() {
		return studentcount;
	}
	public void setStudentcount(int studentcount) {
		this.studentcount = studentcount;
	}
	public String isPublicschool() {
		return publicschool;
	}
	public void setPublicschool(String publicschool) {
		this.publicschool = publicschool;
	}
	@Override
	public String toString() {
		return "SchoolDetail [address=" + address + ", studentcount=" + studentcount + ", publicschool=" + publicschool
				+ "]";
	}
	
	
}
