package com.techment.Day8;

public class HashCodeDemo {

	public static void main(String[] args) {
		String a = "Hello";
		String b = "Hello";
		Integer x=123;
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(x.hashCode());
	}

}
