package com.techment.Day6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingTask {

	public static void main(String[] args) {
		try 
		{
			System.out.println("Enter 1st number");
			Scanner scanner= new Scanner(System.in);
			int a=scanner.nextInt();
			System.out.println("Enter 2nd number");
			int b=scanner.nextInt();
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Dont give zero");
		}
		catch(InputMismatchException ime)
		{
		System.out.println("Dont enter any character");	
		}
		
		}

}
