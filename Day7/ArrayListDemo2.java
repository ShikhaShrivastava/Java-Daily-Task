package com.techment.Day7;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<String> o1= new ArrayList<String>();
		o1.add("Sachin");
		o1.add("Ravi");
		o1.add("Kumar");
		o1.add("Soumya");
		System.out.println("Elements of o1 : "+o1);
		
		ArrayList<String> o2= new ArrayList<String>();
		o2.add("Sourabh");
		o2.add("Manish");
		o2.add("Sachin");
		o2.add("Ankit");
		o2.add("Kumar");
		System.out.println("Elements of o2 : "+o2);
		
		//o1.addAll(o2);
		//o1.removeAll(o1);
		o1.retainAll(o1);
		System.out.println("Element after removing o1"+o2);
	}

}
