package com;
import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter Choice: ");
			int choice=sc.nextInt();
			if(choice ==1)
			{
				System.out.println("Hai..");
			}
			else if(choice ==2)
			{
				System.out.println("Bye ");
			}
			else if(choice ==3)
			{
				System.out.println("Thank you");
				System.exit(0);// Terminates the JVM->Stops the program
			}
			else
			{
				System.out.println("Invalid choice");
			}
			System.out.println(".....................");
				
			
		}
	}

}
