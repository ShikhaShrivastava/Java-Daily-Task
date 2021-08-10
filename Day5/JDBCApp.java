package com.techment.Day5;

public class JDBCApp {

	public static void main(String[] args) {
		JdbcConnection oracle = new Oracle();
		oracle.connect();
		JdbcConnection mysql = new MySql();
		mysql.connect();
	}

}
