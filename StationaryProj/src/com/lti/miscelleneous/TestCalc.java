package com.lti.miscelleneous;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value=Parameterized.class)
public class TestCalc {

	private long expected;
	private int val1;
	private int val2;
	
	Calculator c = new Calculator();
	
	@BeforeClass
	public static void m1()
	{
		System.out.println("Lets Rock.....");
	}	
	
	@Before 
	public void m2()
	{
		System.out.println("Before Testing unit level.....");
	}	
	
	@After 
	public void m3()
	{
		System.out.println("After Testing unit level.....");
	}
	
	@AfterClass
	public static void m4()
	{
		System.out.println("Lets Wrap.....");
	}
	
	/*@Test
	public void testUserInput() {
		
		Scanner sc = new Scanner(System.in);
		String username=sc.next();
	     String password=sc.next();
	     
	     assertEquals("admin", username);
	     assertEquals("ad@123", password);	     
	     
	     System.out.println("Welcome Admin..");	
	}	
	
	@Test
	public void testAddIntInt() {
		assertEquals(12, c.add(6,6));
		//fail("Not yet implemented");
	}

	

	@Test
	public void testSubIntInt() {
		assertEquals(0, c.sub(6,6));
		//fail("Not yet implemented");
	}

	@Test
	public void testMulIntInt() {
		assertEquals(36, c.mul(6,6));
		//fail("Not yet implemented");
	}
	
	@Test
	public void testDivIntInt() {
		assertEquals(1, c.div(6, 6),0);
		//fail("Not yet implemented");
	}*/
	
	@Parameters
	public  static Collection data()
	{
		 return
		Arrays.asList(new Object[][] {
			{1,0,1},
			{7,5,2},
			{23,18,5},
			{34,17,17}	
			
		});		 		
	}	
	
	
	public TestCalc(long expected,int val1,int val2) {
		this.expected = expected;
		this.val1 = val1;
		this.val2 = val2;
		
	}
	
	@Test
	public void testWithParameters() {
		assertEquals(expected,c.add(val1,val2));
	}
	
	
	
	
	
	
	

}
