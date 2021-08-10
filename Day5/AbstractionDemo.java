package com.techment.Day5;

abstract class Bank
{
	void Eligiblity()
	{
		System.out.println("Above 18 can open an account");
	}
	abstract int rateOfInterest(int interestRate);
}
class Axis extends Bank
{

	@Override
	int rateOfInterest(int interestRate) {
       System.out.println("Axis Bank: "+ interestRate);
		return interestRate;
	}
	
}
class Kotak extends Bank
{

	@Override
	int rateOfInterest(int interestRate) {
       System.out.println("Kotak Bank: "+ interestRate);
		return interestRate;
	}
	
}
public class AbstractionDemo {

	public static void main(String[] args) {
		Bank bank=new Kotak();
		System.out.println(bank.rateOfInterest(6)+"%");
		
		Bank bank1=new Axis();
		System.out.println(bank.rateOfInterest(5)+"%");

	}

}
