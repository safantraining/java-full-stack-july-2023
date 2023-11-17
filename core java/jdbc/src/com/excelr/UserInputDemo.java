package com.excelr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter id ");
		int id = scanner.nextInt();
		
		System.out.println("enter name");
		String name= scanner.next();
		
		System.out.println("enter dept");
		String dept= scanner.next();
		
		System.out.println("enter salary ");
		int salary = scanner.nextInt();
		
		System.out.println("enter age ");
		int age = scanner.nextInt();
		

		try
		{
			 // step-1 load the driver class.
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 System.out.println("class found");
			 
			 // step-2 establish the connection.
		    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javasession", "root", "root");
			 System.out.println("connected");
			 
		  PreparedStatement ps =conn.prepareStatement("insert into employee values(?,?,?,?,?)");
		  ps.setInt(1, id);
		  ps.setString(2, name);
		  ps.setString(3, dept);
		  ps.setInt(4,salary);
		  ps.setInt(5, age);	 
		  
		  ps.execute();
		  
		  System.out.println("inserted");
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

}
