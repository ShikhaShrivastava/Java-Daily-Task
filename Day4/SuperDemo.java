package com.techment.Day4;

class Parent
{
	int a=10;
}
class Child extends Parent
{
	int a=20;
	void sum()
	{
		int a=5;
		int c=a+a; // 1 a is accessed through parent
		System.out.println("Sum :"+c);
		
		int d=this.a+a;
		System.out.println(d);
		int e=super.a+a;
		System.out.println(e);
		int f=super.a+this.a;
		System.out.println(f);
	}
}

public class SuperDemo {

	public static void main(String[] args) {
		Child c= new Child();
		c.sum();
	}

}
