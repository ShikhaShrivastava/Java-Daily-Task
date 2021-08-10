package com.techment.Day5;

class Employee
{
	int id;
	String name;
	Address address;
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	void displayEmployeeInfo()
	{
		System.out.println("Id :"+id);
		System.out.println("Name :"+name);
		System.out.println("Door No :"+address.doorNo);
		System.out.println("Street No :"+address.streetName);
		System.out.println("Pincode: "+address.pincode);

	}
}
class Address
{
	int doorNo;
	String streetName;
	String city;
	int pincode;
	
	public Address(int doorNo, String streetName, String city, int pincode) {
		super();
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.city = city;
		this.pincode = pincode;
	}	
}
public class HasARelationship {
	public static void main(String[] args) {
		Address addr= new Address(101,"BTM","Banglore",560084);
		Employee employee= new Employee(1,"shikha",addr);
		employee.displayEmployeeInfo();
	}

}
