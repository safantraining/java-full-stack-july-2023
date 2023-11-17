package com.excelr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		
		

		
		try
		{
			 // step-1 load the driver class.
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 System.out.println("class found");
			 
			 // step-2 establish the connection.
		    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javasession", "root", "root");
			 System.out.println("connected");
			 
		  PreparedStatement ps =conn.prepareStatement("insert into employee values(?,?,?,?,?)");
		  ps.setInt(1, 4);
		  ps.setString(2, "sachin");
		  ps.setString(3, "developer");
		  ps.setInt(4, 50000);
		  ps.setInt(5, 28);	 
		  
		  ps.execute();
		  
		  System.out.println("inserted");
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();

		}
		
	}

}
