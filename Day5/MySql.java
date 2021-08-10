package com.techment.Day5;

public class MySql implements JdbcConnection {

	@Override
	public void connect() {
		System.out.println("I am connecting to MySql Database");
		
	}

}
