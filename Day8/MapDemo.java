package com.techment.Day8;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		Student student1 = new Student(1, "Junaid", 18);
		Student student2 = new Student(1, "Junaid", 18);
	
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		
		HashMap<Student, String> hm = new HashMap<Student, String>();
		hm.put(new Student(1, "Junaid", 18), "cse");
		hm.put(new Student(1, "Junaid", 18), "cse");
		
//		for(Entry<Student, String> stu : hm.entrySet()) {
//			System.out.println(stu);
//		}
//	
	
	}

}
