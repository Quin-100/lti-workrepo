package com.lti.model;

import java.time.LocalDate;

public class Manager extends Employee {
	private String dpartment_name;

	public String getDpartment_name() {
		return dpartment_name;
	}

	@Override
	public void setDpartment_name(String dpartment_name) {
		this.dpartment_name = dpartment_name;
	}	
	
	public Manager() {
		super();
		this.dpartment_name  ="Admin";
	}
	
	public Manager(int id, String name, float salary, LocalDate doj, String dpartment_name) {
		super(id, name, salary, doj);
		this.dpartment_name = dpartment_name;
	}
	
	public Manager(Employee e,String dname)
	{
		  this.id=e.id;
		  this.name=e.name;
          this.salary=e.salary;
          this.doj=e.doj;
          this.dpartment_name=dname;	
	}

	@Override
	public String toString() {
		return "Manager [dpartment_name=" + dpartment_name + ", id=" + id + ", name=" + name + ", salary=" + salary
				+ ", doj=" + doj + "]";
	}
	
	
}
