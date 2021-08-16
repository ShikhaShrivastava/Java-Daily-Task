package com.techment.Java8Fetures;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		Function<Integer, Integer> function1 =(num)->num;
		Function<Integer, String> function2 =(num1)->"value of : "+num1;
		Function<String, Integer> function3 =(name)->name.length();
		
		System.out.println(function1.apply(2));
		System.out.println(function2.apply(5));
		System.out.println(function3.apply("Shikha"));

		

	}

}
