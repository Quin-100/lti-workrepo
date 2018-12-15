package com.lti.model;

import java.util.Scanner;

public class Square extends TwoDShape {

	Scanner sc = new Scanner(System.in);
	public Square() {
		// TODO Auto-generated constructor stub
		this.noSides = 4;
		System.out.println("Enter Length : ");
		this.length = sc.nextFloat();	
		this.breadth = this.length;
	}
	@Override
	public float calcArea() {
		// TODO Auto-generated method stub
		return (float) (this.length * this.breadth);
	}

	@Override
	public float calcVol() {
		// TODO Auto-generated method stub
		System.out.println("Volume of 2D shapes is 0 " );		
		return 0;
	}
	
	public void draw() {
		System.out.println("Square is enjoying.");
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
