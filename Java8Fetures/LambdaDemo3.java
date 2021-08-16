package com.techment.Java8Fetures;

interface Calculation1
{
	int add(int a,int b);

}

public class LambdaDemo3 {

	public static void main(String[] args) {
		Calculation1 calculation1=(a,b)->a+b;
		
		Calculation1 calculation2=(a,b)->
		{
			if(a>b)
				return a;
			return b;
		};
		System.out.println(calculation1.add(2, 4));
		System.out.println("Largest of two num :"+calculation2.add(14,6));

	}

}
