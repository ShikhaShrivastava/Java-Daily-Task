package com.techment.Day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Task1 {

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
		
		o1.addAll(o2);
		System.out.println("After Merging : "+ o1);
		
		LinkedHashSet<String> hs = new LinkedHashSet<String>(o1);
		ArrayList<String> o3= new ArrayList<String>(hs);
		System.out.println("After Removing duplicates: " +o3);
		Collections.sort(o3);
		System.out.println("After Sorting: " +o3);
	}

}
