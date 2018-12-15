package com.lti.practice;

import java.util.Comparator;

public class EmpNameComparator implements Comparator<Emp> {

	@SuppressWarnings("deprecation")
	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		return (o1.getName().compareTo(o2.getName()));
	}
	

	
}
