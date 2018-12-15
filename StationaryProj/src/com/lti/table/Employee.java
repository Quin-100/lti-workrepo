package com.lti.table;

public class Employee {
	
	private int Employee_id;
	private String Employee_name;
	private Department d;
	
	
	public Employee(int employee_id, String employee_name, Department d) {
		super();
		Employee_id = employee_id;
		Employee_name = employee_name;
		this.d = d;
	}


	public int getEmployee_id() {
		return Employee_id;
	}


	public void setEmployee_id(int employee_id) {
		Employee_id = employee_id;
	}


	public String getEmployee_name() {
		return Employee_name;
	}


	public void setEmployee_name(String employee_name) {
		Employee_name = employee_name;
	}


	public String getDepartmentName() {
		return d.getDepartment_name();
	}


	

	public void setD(Department d) {
		this.d = d;
	}
	
	
	@Override
	public String toString() {
		return "Employee [Employee_id=" + Employee_id + ", Employee_name=" + Employee_name + ", d=" + d + "]";
	}


}
