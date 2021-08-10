package com.techment.Day6;

public class Account {
	int balance=5000;
	
	String withdraw(int amount)
	{
		if(amount>balance)
			throw new InsufficientFundException("Insufficient Fund");
		else
			return "you have withdraw " +amount+ " amount.";
	}

}
