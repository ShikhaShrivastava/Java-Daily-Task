package com.techment.Day6;

class LateException extends Exception
{
	public LateException(String msg)
	{
		super(msg);
	}
}
class Stud
{
	void login(int time)throws LateException
	{
		if(time>9)
			throw new LateException("you are absent");
		else
			System.out.println("you are present");
	}
}
public class CustomCheckedException {

	public static void main(String[] args) {
		Stud stud=new Stud();
		try {
		stud.login(10);
		}
		catch(LateException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
