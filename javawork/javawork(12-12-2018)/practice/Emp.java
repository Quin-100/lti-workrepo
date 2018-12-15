package com.lti.practice;

public class Emp {

private int id;
private String name;
private float salary;

public Emp(int id, String name, float salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public float getSalary() {
	return salary;
}

public void setSalary(float salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}





}
