package com.lti.miscelleneous;

public class Calculator {
	//instance variable
	static Calculator instance =null;
	private int num1;
	private int num2;
	//private int result;
	
	public static Calculator getInstance()
	{
		if(instance==null)
		{		    
			instance=new Calculator();	
		}		
		return instance;			
	}  
	
	private Calculator()
	{
		this.num1=5;
		this.num2=10;
		
	}
	

	/*Calculator(int a,int b)
	{
		this.num1=a;
		this.num2=b;
		
	}
	
    Calculator(Calculator c)
    {
    	this.num1=c.num1;
    	this.num2=c.num2;  
    }*/
	
	//getters
	public int getNum1()
	{
		return this.num1;
	}
	
	public int getNum2()
	{
		return this.num2;
	}
	
	public void setNum1(int num1) {
		this.num1 = num1;		
	}
	
	public void setNum2(int num2) {
		this.num2 = num2;		
	}
	
	
	
	public int add() {
		
		return this.getNum1() + this.getNum2();
	}	
	public  int add (int a,int b)
	{
		
		return a+b;
	}
	
	public int add(int... args) {
		int sum = 0 ;
		for(int a  : args) {
			sum += a;
		}
		return sum;		
	}
	
	public int sub() {
		
		return this.getNum1() - this.getNum2();
	}
	public  int sub (int a,int b)
	{		
		return a-b;
	}
	
	public int mul() {
		
		return this.getNum1() * this.getNum2();
	}
	public  int mul (int a,int b)
	{
		
		return a*b;
	}
	
	public float div() {
		
		return this.getNum1() / this.getNum2();
	}
	public  float div (int a,int b)
	{		
		return a/b;
	}
	
	
	
}
