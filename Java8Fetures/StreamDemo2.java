package com.techment.Java8Fetures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemo2 {

	public static void main(String[] args) {
		ArrayList<Integer>num =new ArrayList<Integer>();
		
		for(int i=1; i<=10; i++)
		{
			num.add(i);
		}
		System.out.println("-------------------------Numbers--------------------------- \n"+num);
		System.out.println();
		
		System.out.println("----------Printing only even numbers using Filter-----------");
		num.stream().filter(num1->num1%2==0).forEach(s->System.out.println(s));
		
		System.out.println("----------------------By using Map--------------------------");
		num.stream().map(num2->num2+5).forEach(s->System.out.println(s));
		
		System.out.println("----------------------By using Limit--------------------------");
		num.stream().limit(4).forEach(s->System.out.println(s));
		
		System.out.println("----------------Display number as a List----------------------");
		List<Integer> number=Arrays.asList(1,2,4);
		System.out.println(number);
	}

}
