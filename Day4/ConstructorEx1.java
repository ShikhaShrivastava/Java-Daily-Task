package com.techment.Day4;

import java.util.Scanner;

class Customer
{
	int id;
	String name;
	long contact;
	double minBalance;
	public Customer(int id, String name, long contact) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
	}
	
	public void display()
	{
		System.out.println("Customer Id :"+id);
		System.out.println("Customer Name :"+name);
		System.out.println("Contact :"+contact);
		System.out.println("Minimum Balance :"+minBalance);

	}
	public void checkAccount()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Balance:");
		minBalance=scan.nextDouble();
		
		if(minBalance==0)
		{
			System.out.println("***********You have Zero Balance**********");
		}
		else if(minBalance==1000.0)
		{
			System.out.println("******** Saving Account ************");

		}
		else if(minBalance==10000.0)
		{
			System.out.println("*********** Current Account ***********");

		}
		else
		{
			System.out.println("Please Enter the minbalance");
		}
	}
}

public class ConstructorEx1 {

	public static void main(String[] args) {
		
		Customer customer1= new Customer(1,"Shikha",9962414596l);
		customer1.checkAccount();
		customer1.display();
		
		Customer customer2= new Customer(2,"Riya",876200296l);
		customer2.checkAccount();
		customer2.display();
		
		Customer customer3= new Customer(3,"Naina",7312414586l);
		customer3.checkAccount();
		customer3.display();

	}

}
