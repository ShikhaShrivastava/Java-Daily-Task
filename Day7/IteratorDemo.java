package com.techment.Day7;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<Integer>o1 =new ArrayList<Integer>();
		o1.add(1);
		o1.add(2);
		o1.add(3);
		o1.add(4);
		o1.add(5);
		System.out.println("Element of o1: "+o1);
		
//		Iterator<Integer> itr=o1.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		//Enhanced For Loop
		for(Integer o :o1)
		{
			System.out.println(o);
		}
	}

}
