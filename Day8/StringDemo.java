package com.techment.Day8;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("hello");	
		
		String s4 = new String("hello");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}

}
