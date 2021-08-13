package com.techment.Day10_JDBC;

public interface ConnectionProperty {
	
	public static final String DRIVER_NAME="com.mysql.cj.jdbc.Driver";
	public static final String URL="jdbc:mysql://localhost:3306/techment?autoReconnect=true&useSSL=false";
	public static final String USER_NAME="root";
	public static final String PASSWORD="root";


}
