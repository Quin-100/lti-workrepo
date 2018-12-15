package com.lti.model;

import java.util.Scanner;

public class Triangle extends TwoDShape {
	Scanner sc = new Scanner(System.in);
	public Triangle() {
		// TODO Auto-generated constructor stub
		this.noSides = 3;
		System.out.println("Enter Length : ");
		this.length = sc.nextFloat();

		System.out.println("Enter Breadth : ");
		this.breadth = sc.nextFloat();
	}
	
	@Override
	public float calcArea() {
		// TODO Auto-generated method stub
		return (float) (0.5 * this.length * this.breadth);
	}

	@Override
	public float calcVol() {
		// TODO Auto-generated method stub
		System.out.println("Volume of 2D shapes is 0 " );		
		return 0;
	}
	
	public void draw() {
		System.out.println("Triangle is enjoying.");
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void outline() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void shadow() {
		// TODO Auto-generated method stub
		
	}

}
