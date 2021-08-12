package com.techment.Day8;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>
{
	int id;
	String name;
	String dept;
	int age;
	public Employee(int id, String name, String dept, int age) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", age=" + age + "]";
	}
	
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		
		if(this.age==o.age){
			return 0;
		}
		else if(this.age>o.age) {
			return 1;
		}
		else return -1;
		
	}}

public class UserDefinedExample {

	public static void main(String[] args) {
		ArrayList<Employee>employees= new ArrayList<Employee>();
		employees.add(new Employee(1,"Shikha","Developer",24));
		employees.add(new Employee(2,"Anup","HR",23));
		employees.add(new Employee(3,"Raina","Student",36));
		employees.add(new Employee(4,"Shubham","Manager",18));
		
		for(Employee emp : employees) {
			System.out.println(emp.id+" "+emp.name+ " " + emp.dept+ " "+ emp.age);
		}
		System.out.println("after sorting");
		Collections.sort(employees);
		
		for(Employee emp : employees) {
			System.out.println(emp.id+" "+emp.name+ " " + emp.dept+ " "+ emp.age);
		}

	}

}
