package com.techment.Day3;

import java.util.Scanner;

public class MultiplyTable3 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int limit=10, table=3;
		for(int i = 1; i<=limit;i++)
		{
			System.out.println(table+"*"+i+"="+table*i);
		}

	}

}
