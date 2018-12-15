package com.lti.practice;

import com.lti.model.Pen;

public class TestGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generics<String> genstring = new Generics<String>("Hell yeaaahhh...!!!");
		
		System.out.println(genstring.get());
		genstring.add("using add generics");

		System.out.println(genstring.get());
		
		Generics< Pen> genpen = new Generics<>(new Pen(12,"Parker",500,"Black"));
		Pen p1 = genpen.get();
		System.out.println(p1);
	}

}
