package com.techment.Day7;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList obj= new ArrayList();
		System.out.println("Size is: "+obj.size());
		obj.add(1);
		obj.add("Shikha");
		obj.add(24.78);
		System.out.println("After adding size is : "+obj.size());
		System.out.println("Element in the list: "+ obj);
		obj.add(1,"hello");
		System.out.println("Adding hello in 1st index position : "+obj);
		obj.remove(Integer.valueOf(1));
		System.out.println("Arraylist after remove :" +obj);
		System.out.println("Element at 2nd index : "+obj.get(2));
}

}
