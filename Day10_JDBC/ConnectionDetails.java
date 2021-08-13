package com.techment.Day10_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDetails {

	public static Connection getConnected() throws Exception{
		
		Class.forName(ConnectionProperty.DRIVER_NAME);
		Connection con=DriverManager.getConnection(ConnectionProperty.URL,ConnectionProperty.USER_NAME,ConnectionProperty.PASSWORD);
		System.out.println("Successfully...!");
		return con;

	}

}
