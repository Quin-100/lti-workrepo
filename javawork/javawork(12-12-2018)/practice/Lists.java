package com.lti.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> sallist =  new ArrayList<Double>();
		sallist.add(1245.256);
		sallist.add(2452.4252);
		sallist.add(1556.4545);
		sallist.add(42.21);
		
		Iterator it = sallist.iterator();
		
		while(it.hasNext()) {
			System.out.println((Double)it.next());
		}
	}

}
