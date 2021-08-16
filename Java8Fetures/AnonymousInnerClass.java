package com.techment.Java8Fetures;
//Anonymous InnerClass- A class without name it is used for overriding.

class Parent{
	void phone()
	{
		System.out.println("Mi");
	}
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		
		//Normal way

		Parent p1= new Parent();
		p1.phone();
		
		//Anonymous way of overriding---------------------------
		Parent p2= new Parent()
		{
			void phone()
			{
				System.out.println("Samsung");
			}

		};
		p2.phone();
        //-------------------------------------------------------
	}

}
