package com.lti.model;


public class EquilateralTriangle extends Triangle implements Publishable {
	
	public void draw () {		
		System.out.println("Equilateral Traingle is enjoying");
	}
	
	public void color() {
		System.out.println("color in Equilateral Traingle is enjoying");
	}
	
	public void outline() {
		System.out.println("outline in Equilateral Traingle is enjoying");
	}
	
	public void shadow() {
		System.out.println("shadow in Equilateral Traingle is enjoying");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("print in Equilateral Traingle is enjoying");
	}

	@Override
	public void publish() {
		// TODO Auto-generated method stub
		System.out.println("publish in Equilateral Traingle is enjoying");
	}
	
}
