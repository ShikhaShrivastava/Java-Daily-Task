package com.techment.Day4;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int a[]=new int[5];
		int sum=0, max=a[0], min=a[0], secondMax=0;
		int size=a.length-1;
		System.out.println("Enter your 5 marks");

		for(int i=0; i<a.length; i++)
		{
			a[i]=scanner.nextInt();
			sum=sum+a[i];	
		}
		System.out.println("Marks are");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("sum of all the marks are"+sum);

		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				secondMax=max;
				max=a[i];
			}
			else if(a[i]>secondMax)
			{
				secondMax=a[i];
			}
			
		}
		//Highest & Lowest Score
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			else {
				min=a[i];
			}
		}
		System.out.println("Highest marks scored is:"+max);
		System.out.println("Lowest marks scored is:"+min);
		System.out.println("Second highest score is"+secondMax);

		if (sum > 40) 
		{
		   System.out.println("Student is Pass");		 
		 } 
		 else
		 {
		   System.out.println("Fail");
		 }
 }
}