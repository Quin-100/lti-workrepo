package com.lti.table;

public class Department {
	
	private int department_id;
	private Dept_name department_name;
	private String Location;
	
	
	public Department(int department_id, Dept_name department_name, String location) {
		super();
		this.department_id = department_id;
		this.department_name = department_name;
		Location = location;
	}


	public int getDepartment_id() {
		return department_id;
	}


	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	
	
	public String getDepartment_name() {
		return department_name.name();
	}
	
	public void setDepartment_name(Dept_name department_name) {
		this.department_name = department_name;
	}


	public String getLocation() {
		return Location;
	}


	public void setLocation(String location) {
		Location = location;
	}


	@Override
	public String toString() {
		return "Department [department_id=" + department_id + ", department_name=" + department_name + ", Location="
				+ Location + "]";
	}
	
	
	
	
	
	

}
