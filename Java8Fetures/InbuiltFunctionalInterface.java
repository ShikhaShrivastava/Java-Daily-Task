package com.techment.Java8Fetures;

import java.util.function.Predicate;

//Predicate = it is a inbuilt functional interface which return boolean and takes only one parameter.

public class InbuiltFunctionalInterface {

	public static void main(String[] args) {
		Predicate<Integer> predicate= (num)-> num>18;
		
		System.out.println(predicate.test(20)); //true
		
		Predicate<String> strpredicate= (name)-> name.contains("a");
		System.out.println(strpredicate.test("Shikha"));
		
		
		

	}

}
