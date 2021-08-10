package com.techment.Day5;

public class Oracle implements JdbcConnection {

	@Override
	public void connect() {
		System.out.println("I am connecting to Oracle Database");
	}

}
