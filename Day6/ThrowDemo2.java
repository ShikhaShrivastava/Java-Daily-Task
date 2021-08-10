package com.techment.Day6;

import java.io.FileNotFoundException;

class Student1
{
	void checkEligibility(int age) 
	{
		if(age>=18)
		{
			System.out.println("you can apply for loan");
		}
		else
			throw new ArithmeticException("you can not apply fr loan");
	}
}

public class ThrowDemo2 {

	public static void main(String[] args) {
		Student1 student = new Student1();
		student.checkEligibility(15);
	}

}
