package com.techment.Day7;

import java.util.ArrayList;

public class UserDefinedType {

	public static void main(String[] args) {
		Employee emp1= new Employee(1,"Shikha","developer");
		Employee emp2= new Employee(1,"Raina","student");
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(new Employee(3,"Shubh","sales executive"));
		
		for(Employee emp : employees)
		{
			System.out.println(emp.id+" "+emp.name+" "+emp.dept);
		}
		employees.set(1, new Employee(12,"Anup","marketing"));
		System.out.println("After setting in index 1:");
		for(Employee emp : employees)
		{
			System.out.println(emp.id+" "+emp.name+" "+emp.dept);
		}
	}

}
