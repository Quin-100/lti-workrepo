package com.test.jdbc.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.test.jdbc.demo.model.Department;
import com.test.utils.ConnectionManager;

public class DempartmentDAOImpl implements DepartmentDAO{

	Connection conn = ConnectionManager.getConnection();
	Statement stmnt = null;
	ResultSet res = null;
	PreparedStatement ppdStmnt = null;
	@Override
	public void addDepartment(Department dep) {
		// TODO Auto-generated method stub
		String query = "Insert into Departments Values(?, ?, ?, ?)";
		try {
			ppdStmnt = conn.prepareStatement(query);
			ppdStmnt.setInt(1, dep.getDepId());
			ppdStmnt.setString(2, dep.getdName());
			ppdStmnt.setInt(3, dep.getManId());
			ppdStmnt.setInt(4, dep.getLocId());
			
			int res = ppdStmnt.executeUpdate();
			if(res == 1)
				System.out.println("Department entry inserted successfully.."+res);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateDepartment(Department dep) {
		// TODO Auto-generated method stub
		String query = "Update Departments set department_name = ?, manager_id=?, location_id=? where department_id = ?";
		try {
			ppdStmnt = conn.prepareStatement(query);
			ppdStmnt.setString(1, dep.getdName());
			ppdStmnt.setInt(2, dep.getManId());
			ppdStmnt.setInt(3, dep.getLocId());
			ppdStmnt.setInt(4, dep.getDepId());
			
			int res = ppdStmnt.executeUpdate();
			System.out.println("Department entry successfully updated.."+res);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteDepartment(int depId) {
		// TODO Auto-generated method stub
		String query = "Delete Departments where department_id = ?";
		try {
			ppdStmnt = conn.prepareStatement(query);			
			ppdStmnt.setInt(1, depId);
			
			int res = ppdStmnt.executeUpdate();
			System.out.println("Department entry successfully deleted.."+res);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public  List<Department> allDepartment() {
		// TODO Auto-generated method stub
		
		List<Department> lstDep = new ArrayList<>();
		String query = "select * from Departments";
		try {
			stmnt = conn.createStatement();
			res = stmnt.executeQuery(query);
			while(res.next()) {					
				int id = res.getInt(1);
				String name = res.getString(2);
				int manId = res.getInt(3);
				int locId = res.getInt(4);
				Department dep = new Department(id,name,manId,locId);
				lstDep.add(dep);
				
			}
		 } 			
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}					
		
		return lstDep;
	}

	@Override
	public Department allDepartmentById(int depId) {
		// TODO Auto-generated method stub
		Department dep = null;
		//List<Department> lstDep = new ArrayList<>();
		String query = "select * from Departments where department_id = ?"; 
		try {
			
			ppdStmnt = conn.prepareStatement(query);			
			ppdStmnt.setInt(1, depId);				
			
			//res = stmnt.executeQuery(query);			
			res = ppdStmnt.executeQuery();
			while(res.next()) {					
				int id = res.getInt(1);
				String name = res.getString(2);
				int manId = res.getInt(3);
				int locId = res.getInt(4);
				dep = new Department(id,name,manId,locId);
				//lstDep.add(dep);
			}			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return dep;
	}

	
	
	

}
