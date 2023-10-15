package com.excelr.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.excelr.persistance.Employee;

public class InsertDemoClient {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
	SessionFactory factory =	configuration.buildSessionFactory(); // connection will check, files will correctness
       Session session=  factory.openSession(); // open the connection with given configuration.//
                                               // It provvides the methods. to perform operation
       
       //  insert code
        Transaction transaction =   session.beginTransaction();
      //  Employee employee = new Employee(2, "mohit", "developer", 10, 0);
        Employee employee = new Employee();
        employee.setId(3);
        employee.setName("kumar");
      
        session.save(employee);
       transaction.commit();
       
       
       // reterive code
      // Employee emp =   session.load(Employee.class, 4);
      // System.out.println(emp);
       
       
       //delete code
    
       
      
       
       session.close();
		 
	}

}
