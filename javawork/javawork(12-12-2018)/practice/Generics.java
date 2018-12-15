package com.lti.practice;

public class Generics<T> {
	T t1;
	public Generics(T t) {
		// TODO Auto-generated constructor stub
		this.t1 = t;
	}
	
	public void add(T t) {
		System.out.println("Object added of type "+t);
		this.t1 = t;
	}
	
	public T get() {
		return this.t1;
	}
}
