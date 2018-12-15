package com.lti.model;

import java.util.Scanner;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Shape shape = null;
		System.out.println("Enter Shape to draw.");
		System.out.println("1. Equi Triangle.");
		System.out.println("2. Isosceles Triangle.");
		System.out.println("3. Square.");
		System.out.println("Enter choice no. : ");
		int shpNo = sc.nextInt();
		switch (shpNo) {
		case 1 :
			shape = new EquilateralTriangle();			
			break;
		case 2 :
			shape = new IsocellesTriangle();
			break;
		case 3 :
			shape = new Square();
			System.out.println("Enter Activity to calculate.");
			System.out.println("1. Area.");
			System.out.println("2. Volume.");			
			System.out.println("Enter choice no. : ");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Area of square : " + shape.calcArea());				
				break;
			case 2:
				shape.calcVol();				
				break;
			default:
				break;
			}
			break;
		default:
			break;
		}
		drawShape(shape);
	}
	
	public static void drawShape(Shape shape) {
		shape.draw();
	}
	
}
