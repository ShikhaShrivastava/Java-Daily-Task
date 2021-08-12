package com.techment.Day8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapDemo1 {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(1, "Shikha");
		hm.put(2, "Aashu");
		hm.put(3, "gcgh");
		hm.put(4, "Shikha");
		hm.put(5, "Shikha");
		hm.put(6, "Shikha");
		hm.put(7, "Shikha");
		
		System.out.println("hashmao :"+ hm);
		
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put(1, "Shikha");
		lhm.put(2, "Aashu");
		lhm.put(3, "gcghgvmnvh");
		lhm.put(4, "Raina");
		lhm.put(5, "Shikha");
		lhm.put(6, "Shikha");
		lhm.put(7, "Shikha");
		
		System.out.println("linked hash map :"+ lhm);
		
		TreeMap tm = new TreeMap();
		tm.put(1, "Shikha");
		tm.put(2, "Aishma");
		tm.put(3, "Shikha");
		tm.put(4, "Shikha");
		tm.put(5, "Shikha");
		tm.put(6, "Shikha");
		tm.put(7, "Shikha");
		
		System.out.println("linked hash map :"+ tm);
	}

}
