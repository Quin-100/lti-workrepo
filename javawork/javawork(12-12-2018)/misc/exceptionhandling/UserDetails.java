package com.lti.misc.exceptionhandling;

import java.io.Serializable;

public class UserDetails implements Serializable {

	@Override
	public String toString() {
		return "UserDetails [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	private String name;
	private int age;
	private float salary;
	
	public UserDetails(String name, int age, float salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}		
}
