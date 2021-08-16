package com.techment.Java8Fetures;

interface Bank //it contain only one method therefore it is functional interface
{
	void display();
}

public class LambdaDemo1 {
	
	public static void main(String[] args) {
		
		
		//Single line body
		Bank bank = ()-> System.out.println("This is display method");
		bank.display();
		
		//Multi-line Body
		Bank bank2= ()->
		{
			System.out.println("This is");
			System.out.println("a multiline");
			System.out.println("body");
		};
		bank2.display();
		
	}

}

// -> tells single line body