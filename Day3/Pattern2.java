package com.techment.Day3;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		  System.out.println("Enter the size");
		  int n=scan.nextInt();
		  
		  for(int i=1;i<=n;i++)
		  {
			  for(int j=1;j<=n;j++)
			  {
				  if(i==j)
				  {
					  System.out.print("*");
				  }
				  else
				  {
					  System.out.print(" ");
				  }
			  }
			  System.out.println();
		  }
	}

}
