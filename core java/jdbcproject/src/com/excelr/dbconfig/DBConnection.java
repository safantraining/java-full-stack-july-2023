package com.excelr.dbconfig;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public static Connection connect() throws Exception
	{
		 Class.forName(DBProperties.DRIVER_CLASS);
		 System.out.println("class found");
		 
		 Connection conn=DriverManager.getConnection(DBProperties.URL, DBProperties.USERNAME, DBProperties.PASSWORD);
		 System.out.println("connected");
		 
		 return conn;
	}
}
