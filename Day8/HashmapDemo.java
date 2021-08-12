package com.techment.Day8;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashmapDemo {

	public static void main(String[] args) {
		HashMap<String,Integer> h= new HashMap<String,Integer>();
		h.put("Shikha", 1);
		h.put("Shubu", 2);
		h.put("Raina", 3);
		h.put("Anup", 4);
		System.out.println("Elements are: " +h);
		for(Entry<String, Integer> e: h.entrySet())
		{
			System.out.println(e);
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}

	}

}
