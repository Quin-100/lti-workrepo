package com.test.jdbc.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.test.jdbc.demo.dao.DempartmentDAOImpl;
import com.test.jdbc.demo.dao.DepartmentDAO;
import com.test.jdbc.demo.model.Department;

public class DMLDept {
	static Department dep = null;
	static DempartmentDAOImpl depdao = new DempartmentDAOImpl();
	
	public static void accepDetails() {
		
			Scanner br = new Scanner(System.in);
			//BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			System.out.println(" Enter Department Id : ");		
			int id = br.nextInt();
			System.out.println("Enter Department Name :");
			String name = br.next();
			System.out.println("Enter Department ManagerId :");
			int manId = br.nextInt();
			System.out.println("Enter Department LocationId :");
			int locId = br.nextInt();
			dep = new Department(id,name,manId,locId);
		
	}
	
	public static void main(String[] args) {		
		
		//BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int choice=1;
		int depId = 0;
		List<Department> lstDep = new ArrayList<Department>();
		
		while (choice>=1 && choice<6)
		{
			System.out.println("Department CRUD");
			System.out.println("1.Add department");
			System.out.println("2.Update department");
			System.out.println("3.Delete department");
			System.out.println("4.List All department");
			System.out.println("5.List  department by id");
			System.out.println("6.Exit");
			
		    System.out.println("Choose CRUD to perform");
		         
					choice=sc.nextInt();
				
		         
		         switch (choice) {
		         
				case 1:	
					accepDetails();
					addDepartment(dep);
					break;
				case 2:	
					accepDetails();					
					updateDepartment(dep);
					break;
				case 3:	
					System.out.println("Enter DepartmentId to delete : ");
					depId = sc.nextInt();
					deleteDepartment(depId);
					break;
				case 4:	
					lstDep = depdao.allDepartment();
					for(Department d : lstDep) {
						System.out.println(d);
					}
					System.out.println("No of Departments :"+lstDep.size());
					break;
				case 5:	
					System.out.println("Enter DepartmentId to display : ");
					depId = sc.nextInt();
					dep = allDepartmentById(depId);
					/*for(Department d : lstDep) {
						System.out.println(d);
					}*/
					System.out.println(dep);
					System.out.println("No of Departments :"+lstDep.size());
					break;
				case 6:	
					System.exit(0);
					break;

				default:
					break;
				}		    
		}		
	}

	private static Department allDepartmentById(int depId) {
		// TODO Auto-generated method stub		
		return depdao.allDepartmentById(depId);
	}

	private static List<Department> allDepartment() {
		// TODO Auto-generated method stub		
		return depdao.allDepartment();
	}

	private static void deleteDepartment(int depId) {
		// TODO Auto-generated method stub
		depdao.deleteDepartment(depId);
	}

	private static void updateDepartment(Department dep) {
		// TODO Auto-generated method stub
		depdao.updateDepartment(dep);
	}

	private static void addDepartment(Department dep) {
		// TODO Auto-generated method stub
		depdao.addDepartment(dep);
	}

}
