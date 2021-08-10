package com.techment.Day4;
class Employee
{
	private int id;
	private String name ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setId(1);
		emp.setName("Shikha");
		System.out.println(emp.getId());
		System.out.println(emp.getName());
	}

}
