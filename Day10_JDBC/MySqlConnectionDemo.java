package com.techment.Day10_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySqlConnectionDemo {

	public static void main(String[] args) {
		try {
			//step-1
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Class is found");
			
			//step-2
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techment?autoReconnect=true&useSSL=false","root","root");
			System.out.println("Connected");
			
			Statement stmt=con.createStatement();
//			stmt.execute("insert into employee values(3,'Vishal',2060)");
//			System.out.println("Inserted");
			
			ResultSet rs=stmt.executeQuery("select * from employee");
			 while(rs.next())
			 {
				 System.out.println(rs.getInt(1) + " "+rs.getString(2)+" "+rs.getInt(3));
			 }
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
