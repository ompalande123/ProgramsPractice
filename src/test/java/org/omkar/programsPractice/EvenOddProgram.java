package org.omkar.programsPractice;

import java.util.Scanner;

public class EvenOddProgram {

	public static void main(String[] args) {
		
		
		
		
		
		
		// Using scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer value: ");
		int number=sc.nextInt();
		
		if(number%2==0)
		{
			System.out.println(number+ " is even number.");
			
		}
		else
		{
			System.out.println(number+ " is odd number.");
			
		}
		

	}

}
