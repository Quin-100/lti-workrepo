package com.lti.model;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class TestManger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Manager mg = new Manager();
		mg.setId(1);
		mg.setName("Amit");
		mg.setSalary(25000);
		mg.setDoj( LocalDate.of(2000, 01, 20));
		
		//System.out.println(mg.toString());
		
		Employee e1 = new Employee();		
		Employee e2 = null;
		//System.out.println(e1.toString());
		
		System.out.println("Enter object type : ");
		String typeofobj = sc.next();
		
		if(typeofobj.equals("Employee")) {
			e2 = new Employee();	
			e2.setId(1);
			e2.setName("Amit");
			e2.setSalary(25000);
			e2.setDoj( LocalDate.of(2000, 01, 20));
		}
		else if(typeofobj.equals("Manager")) {
			e2 = new Manager();
			e2.setId(1);
			e2.setName("Amit");
			e2.setSalary(25000);
			e2.setDoj( LocalDate.of(2000, 01, 20));
			e2.setDpartment_name("comps");
		}		
		callgreeting(e2);
	}

	private static void callgreeting(Employee e2) {
		if(e2 instanceof Employee) {
			System.out.println(e2.toString());
		}
		else if (e2 instanceof Manager) {
			System.out.println(e2.toString());
		}		
	}

}
