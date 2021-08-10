package com.techment.Day4;

class Parent1
{
	Parent1()
	{
		System.out.println("This is a default Parent class constructor");

	}
}
class Child1 extends Parent1
{
  Child1()
  {
		System.out.println("This is default child class constructor");
  }
}


public class SuperConstructor {

	public static void main(String[] args) {
		
		Child1 c1= new Child1(); //From here we are trying to access parent class default constructor which is possible.
		 
		//Note - If we try to access Parent class parameterized constructor from child then we have to make use of
		 //       super method

	}

}
