package com.lti.practice;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TestAnn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class e=Emp.class;
		Annotation a[]=e.getAnnotations();
		System.out.println("Annotations from class :");
		for (Annotation a1:a)
		{
		System.out.println(a1.toString());
		}
		
		Method met[] = e.getMethods();
		//Annotation a[]=e.getAnnotations();
		System.out.println("Annotations from methods :");
		for (Method m:met)
		{			
			Annotation a2[]=m.getAnnotations();
			for (Annotation a3:a2)
			{
			System.out.println(a3.toString());
			}
		}
		
		@SuppressWarnings("unchecked")
		Constructor<Emp> constructor[] = e.getConstructors();
		System.out.println("Annotations from constructors :");
		for (Constructor<Emp> c:constructor)
		{			
			Annotation a4[]=c.getAnnotations();
			for (Annotation a5:a4)
			{
			System.out.println(a5.toString());
			}
		}
	}
}
