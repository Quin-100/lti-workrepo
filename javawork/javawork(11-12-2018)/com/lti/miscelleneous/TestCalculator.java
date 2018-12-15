package com.lti.miscelleneous;

import java.util.Scanner;

public class TestCalculator {

	public static void main(String[] args) {		
		int input1,input2;
		float output;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number : ");
		input1 = sc.nextInt();

		System.out.println("Enter 2nd number : ");
		input2 = sc.nextInt();
		
		Calculator calc = Calculator.getInstance();
		//input1=calc.getNum1();
		//input2=calc.getNum2();
		
		output=calc.add(calc.getNum1(), calc.getNum2());
		
		System.out.println("Addition : "+output);
		
		output=calc.sub(calc.getNum1(), calc.getNum2());
		
		System.out.println("Substraction : "+output);
		
		output=calc.mul(calc.getNum1(), calc.getNum2());
		
		System.out.println("Multiplication : "+output);		
		
		output=calc.div(calc.getNum1(), calc.getNum2());		
		
		System.out.println("Division : "+output );
		
		System.out.println(" ");
		
		System.out.println("Add : "+calc.add() );
		System.out.println("Sub : "+calc.sub() );
		System.out.println("Mul : "+calc.mul() );
		System.out.println("Division : "+calc.div() );
		

		System.out.println(" ");
		
		Calculator calc2=Calculator.getInstance();
		System.out.println("Add : "+calc2.add() );
		System.out.println("Sub : "+calc2.sub() );
		System.out.println("Mul : "+calc2.mul() );
		System.out.println("Division : "+calc2.div() );
		
		Calculator calc3=Calculator.getInstance();
		calc3.setNum1(input1);
		calc3.setNum2(input2);
		
		System.out.println(" ");	
		
		System.out.println("Add : "+calc.add() );
		System.out.println("Sub : "+calc.sub() );
		System.out.println("Mul : "+calc.mul() );
		System.out.println("Division : "+calc.div() );
		
		sc.close();
		System.out.println(calc.hashCode());
		System.out.println(calc2.hashCode());
		System.out.println(calc3.hashCode());	
		
	}

}
