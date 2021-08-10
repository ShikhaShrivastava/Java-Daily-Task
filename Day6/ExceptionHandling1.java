package com.techment.Day6;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		System.out.println("Name is shikha");
		System.out.println("Email is shikha29@gmail.com");
		try
		{
			System.out.println(1/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Dont give zero in denominator");
		}
		System.out.println("Contact is 8962414595");
	}

}
