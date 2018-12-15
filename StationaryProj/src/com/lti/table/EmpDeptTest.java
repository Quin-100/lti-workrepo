package com.lti.table;

public class EmpDeptTest {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		Department d1=new Department(101,Dept_name.HR,"Mumbai");
		
		Employee e1=new Employee(111,"Ajay",d1);
		
		System.out.println("Id : "+e1.getEmployee_id());
		System.out.println("Name : "+e1.getEmployee_name());
		System.out.println("Department : "+e1.getDepartmentName());

	}

}
