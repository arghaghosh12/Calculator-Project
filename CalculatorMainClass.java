package com;

import java.util.Scanner;

public class CalculatorMainClass {
	public static void main(String[] args) {
		
	
	System.out.println("Welcome to calculate project.");
	System.out.println("..........................");
	Scanner sc=new Scanner(System.in);
	CalculatorImpl calc=new CalculatorImpl();
	
	//Menu Driven Programs
	while(true) {
		
	System.out.println("1: Addition\n2: Substraction");
	System.out.println("3: Multiplication \n4: Divition");
	System.out.println("5: Exit");
	System.out.println("Enter choice: ");
	int choice=sc.nextInt();
	/**
	 * local veriable do not have default values .therefore initializeing to 0.
	 */
	
	int a=0;
	int b=0;
	 
	if(choice>=1 && choice <=4)
	{
		System.out.println("Enter 2 numbers: ");
		 a=sc.nextInt();
		 b=sc.nextInt();
		
	}
	if(choice==1)
	{
		
		calc.add(a, b);
		
	}
	else if(choice==2)
	{
		
		calc.sub(a, b);
		
	}
	else if(choice==3)
	{
		calc.mul(a, b);
		
	}
	
	else if(choice==4)
	{
		calc.div(a, b);
		
	}
	else if(choice ==5)
	{
		System.out.println("Exit...");
		System.exit(0);
	}
	else
	{
		System.out.println("Invalid choice");
	}
	}
	

	}


}
