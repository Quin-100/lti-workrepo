package com.lti.practice;

import java.util.Comparator;

public class EmpIdComparator  implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		if(o1.getId()==o2.getId())
			return(0);
		else if (o1.getId()>o2.getId())
			return(1);
		else
			return(-1);
		
	}
	
	
	

}
