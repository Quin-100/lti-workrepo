package com.test.jdbc.demo.dao;

import java.util.List;

import com.test.jdbc.demo.model.Department;

public interface DepartmentDAO {
	

	public  void addDepartment(Department dep);
	public void updateDepartment(Department dep);
	public void deleteDepartment(int depId);
	public  List<Department> allDepartment();
	public Department allDepartmentById(int depId);
	
	

}
