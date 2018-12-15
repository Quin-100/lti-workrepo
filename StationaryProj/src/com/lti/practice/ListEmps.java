package com.lti.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class ListEmps {
	public static void main(String[] args) {
	
		  Emp e1=new Emp(231,"jopn",33);
		  Emp e2=new Emp(230,"json",55);
		  Emp e3=new Emp(238,"joe",4);
		  
		  Emp e4=new Emp(236,"chan",334);
		  Emp e5=new Emp(237,"ross",553);
		  Emp e6=new Emp(239,"monic",434);
		  
		  List <Emp> emplist=new ArrayList<>();
		  
		  emplist.add(e1);
		  emplist.add(e2);
		  emplist.add(e3);
		  
		  List <Emp> temp_emplist=new ArrayList<>();
		  
		  temp_emplist.add(e4);
		  temp_emplist.add(e5);
		  temp_emplist.add(e6);
		  
		  
		  List <Emp> allEmployees=new LinkedList<>();
		  allEmployees.addAll(temp_emplist);
		  allEmployees.addAll(emplist);
		  
		  
		  Iterator<Emp> it = allEmployees.iterator();  
		  
		  System.out.println("Linked List");
		  while (it.hasNext()) {
			Emp object = (Emp) it.next();
			System.out.println(object);
			
		}
		  
		  allEmployees.remove(2);
		  System.out.println("After Deleting..");
		  for(Emp e : allEmployees) {
			  System.out.println(e);
		  }	  
		  
		  List<Integer> linkedlist = new LinkedList<>();
		  Integer[] arr = {1231, 12312, 25,25, 2362, 232,232};
		  linkedlist = Arrays.asList(arr);
		  System.out.println("LinkedList : ");
		  System.out.println(linkedlist);	  
		  
		  
		  Set<Integer> set = new HashSet<>();
		  set.addAll(linkedlist);
		  System.out.println("LinkedList as Set : ");
		  System.out.println(set);
		  
		  Set<Integer> set1 = new TreeSet<>();
		  set1.addAll(linkedlist);
		  System.out.println("LinkedList as TreeSet : ");
		  System.out.println(set1);
		  
		  Collections.sort(allEmployees);
		  System.out.println("LinkedList as Collection sort (Comparable : EmpSalary using compareTo()): ");
		  Iterator<Emp> it1 = allEmployees.iterator();  
		  while (it1.hasNext()) {
			Emp object = (Emp) it1.next();
			System.out.println(object);			
		  }
		 
		  
		  Collections.sort(allEmployees, new EmpNameComparator());
		  System.out.println("LinkedList as Collection sort (Comparator : EmpName using compare()): ");
		  Iterator<Emp> it2 = allEmployees.iterator();  
		  while (it2.hasNext()) {
			Emp object = (Emp) it2.next();
			System.out.println(object);			
		  }
		 
		  

		  Collections.sort(allEmployees, new EmpIdComparator());
		  System.out.println("LinkedList as Collection sort  (Comparator : EmpId using compare()): ");
		  Iterator<Emp> it3 = allEmployees.iterator();  
		  while (it3.hasNext()) {
			Emp object = (Emp) it3.next();
			System.out.println(object);			
		  }
		  
		  Map<String, Emp> emp = new HashMap<>();
		  emp.put("Admin", e1);
		  emp.put("IT", e2);
		  emp.put("Accounts", e3);
		  System.out.println("Hash Map List ; ");
		  System.out.println("Complete Set :");
		  System.out.println(emp.entrySet());
		  System.out.println("Only Values:");
		  System.out.println(emp.values());
		  System.out.println("Only Keys :");
		  System.out.println(emp.keySet());
		  

	}
}
