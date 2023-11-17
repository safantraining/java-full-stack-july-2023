package com.excelr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MySqlConnectionDemo {

	public static void main(String[] args) {

	  try 
	  {
		  // step-1 load the driver class.
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 System.out.println("class found");
		 
		 // step-2 establish the connection.
	    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javasession", "root", "root");
		 System.out.println("connected");
		 
	      
		 //step-3 creating the statement object.
		 Statement stmt =  conn.createStatement();
		 
		 stmt.execute("insert into employee values(3,'john','developer',80000,31)");
		 System.out.println("inserted");
		 
		 //step-4 close the connection.
		 conn.close();
		 
		
		 
		 
	  } 
	  catch (Exception e) {
		e.printStackTrace();
	}
	
}

}

