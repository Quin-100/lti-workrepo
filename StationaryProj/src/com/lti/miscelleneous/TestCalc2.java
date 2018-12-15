package com.lti.miscelleneous;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalc2 {

	Calculator c = new Calculator();
	
	@BeforeClass
	public static void b1() {
		System.out.println("Lets Rock again..");
	}
	
	@Before
	public  void b2() {
		System.out.println("Before Testing unit level again.....");
	}
	
	@After
	public  void a1() {
		System.out.println("After Testing unit level again.....");
	}
	
	@AfterClass()
	public static void a2(){
		System.out.println("Lets Wrap again..");
	}
	
	@Test
	public void testSubIntInt() {
		assertEquals(2,c.sub(4,2));
	}

	@Test
	public void testMulIntInt() {
		assertEquals(4, c.mul(2,2));
	}

}
