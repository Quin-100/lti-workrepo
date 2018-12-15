package com.lti.banking;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person() {
			
			@Override
			public void sleep() {
				// TODO Auto-generated method stub
				System.out.println("Eat less..");
			}
			
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("Sleep lot..");
			}
		};		
		
	
		p1.eat();
		p1.sleep();
	}

}
