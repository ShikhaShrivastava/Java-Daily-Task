package com.techment.Java8Fetures;

interface Calculation
{
	void add(int a,int b);

}

public class LambdaDemo2 {

	public static void main(String[] args) {
		Calculation calculation=(a,b)->System.out.println("Result :"+(a+b));
		calculation.add(2, 3);
		calculation.add(4, 5);
		
		

	}

}
