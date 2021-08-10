package com.techment.Day7;

import java.util.ArrayList;

public class UserDefinedType1 {

	public static void main(String[] args) {
		Employee1 emp1= new Employee1(1,"Shikha","developer");
		Employee1 emp2= new Employee1(1,"Raina","student");
		
		ArrayList<Employee1> employees = new ArrayList<Employee1>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(new Employee1(3,"Shubh","sales executive"));
		
		for(Employee1 emp : employees)
		{
			if(emp.getId()>2)
				emp.setDept("Manager");
			System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getDept());
		}
	}

}
