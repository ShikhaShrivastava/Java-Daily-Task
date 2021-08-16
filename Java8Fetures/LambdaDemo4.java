package com.techment.Java8Fetures;

interface Calculation2
{
	int largest(int a,int b, int c);

}


public class LambdaDemo4 {

	public static void main(String[] args) {
		Calculation2 calculation2=(a,b,c)->
		{
			if(a>b && a>c)
				return a;
			else if(b>c && b>a)
				return b;
			else
				return c;
		};
		System.out.println("Largest of three num :"+calculation2.largest(2,4,6));
	}

}
