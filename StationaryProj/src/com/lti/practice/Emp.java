package com.lti.practice;

@Author(id = 12,name = "Avinash",email = "Avi@g.com")
public class Emp implements Comparable<Emp> {

private int id;
private String name;
private float salary;


@Author(id = 14,name = "Pravin",email = "Prav@g.com")
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


@Author(id = 15,name = "Bhagat",email = "bhagat@g.com")
@Deprecated
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

@Override
public int compareTo(Emp o) {
	// TODO Auto-generated method stub
	if (this.salary==o.salary)
	{
		return 0;		
	}
	else if (this.salary>o.salary)
	{
		return -1;
	}
	else
		return 1;	
}


}
