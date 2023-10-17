package com.excelr.app;

import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.excelr.entity.Employee;

public class ReteriveWithCondition {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
	SessionFactory factory =configuration.buildSessionFactory(); // connection will check, files will correctness
       Session session=  factory.openSession(); // open the connection with given configuration.//
                                               // It provvides the methods. to perform operation
       
       Scanner scanner = new Scanner(System.in);
       System.out.println("enter the id to display");
       int id = scanner.nextInt();
   
       Transaction transaction =   session.beginTransaction();
    Query query=   session.createQuery("delete from Employee e where e.id=:empid");
    query.setParameter("empid",id);
    query.executeUpdate();
    
    System.out.println("deleted");
    
	/*
	 * List<Employee> employees = query.getResultList();
	 * 
	 * for(Employee employee : employees) { System.out.println(employee); }
	 */
    
    transaction.commit();
    
	}

}
