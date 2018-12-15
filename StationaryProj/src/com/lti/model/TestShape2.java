package com.lti.model;

public class TestShape2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Changeable ch = new EquilateralTriangle();
		ch.color();
		ch.outline();
		ch.shadow();
		
		EquilateralTriangle eq = new EquilateralTriangle();
		eq.color();
		eq.print();
	}

}
