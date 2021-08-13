package com.techment.Day10_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		
		try {
			//step-1
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Class is found");
			
			//step-2
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techment?autoReconnect=true&useSSL=false","root","root");
			System.out.println("Connected");
			
			PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?)");
			Scanner scanner= new Scanner(System.in);
			System.out.println("Enter id :");
			int id= scanner.nextInt();
			System.out.println("Enter name : ");
			String name= scanner.next();
			System.out.println("Enter Salary : ");
			int salary= scanner.nextInt();
			ps.setInt(1,id);
			ps.setString(2,name);
			ps.setInt(3, salary);
			ps.execute();
			System.out.println("Row/s Inserted");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
