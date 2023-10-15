package com.excelr.client;


import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.excelr.persistance.Employee;



public class HQLBulkOperation {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
	SessionFactory factory =configuration.buildSessionFactory(); // connection will check, files will correctness
       Session session=  factory.openSession(); // open the connection with given configuration.//
                                               // It provvides the methods. to perform operation
       
      Query query =  session.createQuery("select e from Employee e");
     List<Employee> employees =  query.getResultList();
    
      // enhanced for loop
     for(Employee e : employees)
     {
    	System.out.println(e);
     }
     
     System.out.println("---using for each method---");
     // using java 8
     employees.forEach(System.out::println);
     
     session.close();
	}

}
