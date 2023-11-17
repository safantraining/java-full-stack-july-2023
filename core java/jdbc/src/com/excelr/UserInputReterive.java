package com.excelr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class UserInputReterive {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter id to find the record ");
		int id = scanner.nextInt();
		
		try
		{
			 // step-1 load the driver class.
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 System.out.println("class found");
			 
			 // step-2 establish the connection.
		    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javasession", "root", "root");
			 System.out.println("connected");
			 
		  PreparedStatement ps =  conn.prepareStatement("select * from employee where id=?");
		  ps.setInt(1, id);
		  ResultSet rs = ps.executeQuery();
		  
		  
		  
		    while(rs.next())
		   {
			   System.out.println(rs.getInt(1) +" "+ rs.getString(2) +" "+ rs.getString(3) +" "+ rs.getInt(4)+" "+rs.getInt(5));
		   }
		  
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}
}
