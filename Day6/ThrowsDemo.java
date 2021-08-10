package com.techment.Day6;

import java.io.FileNotFoundException;

class Student
{
	void checkEligibility(int age) throws FileNotFoundException
	{
		if(age>=18)
		{
			System.out.println("you can apply for loan");
		}
		else
			throw new FileNotFoundException("you can not apply fr loan");
	}
}

public class ThrowsDemo {

	public static void main(String[] args) throws FileNotFoundException {
		Student student = new Student();
		student.checkEligibility(15);
	}

}
