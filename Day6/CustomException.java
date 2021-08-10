package com.techment.Day6;

public class CustomException {

	public static void main(String[] args) {
		Account account= new Account();
		try 
		{
		System.out.println(account.withdraw(2000));
		}
		catch(InsufficientFundException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
