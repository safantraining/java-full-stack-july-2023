package com.excelr.client;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.excelr.persistance.Employee;

public class InsertDemoClient {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
	SessionFactory factory =	configuration.buildSessionFactory(); // connection will check, files will correctness
       Session session=  factory.openSession(); // open the connection with given configuration.//
                                               // It provvides the methods. to perform operation
       
       //  insert code
        Transaction transaction =   session.beginTransaction();
      //  Employee employee = new Employee(2, "mohit", "developer", 10, 0);
        
        System.out.println("enter name");
        String name = scanner.nextLine();
        
        System.out.println("enter dept");
        String dept = scanner.nextLine();
        
        System.out.println("enter age");
        int age = scanner.nextInt();
        
        System.out.println("enter salary");
        int salary = scanner.nextInt();
        
        
        Employee employee = new Employee();   //transient state.
       employee.setName(name);
       employee.setDept(dept);
       employee.setSalary(salary);
       employee.setAge(age);
       
       session.save(employee);  // persistance state
       
       transaction.commit();
       
       System.out.println("inserted");
       
       scanner.close(); // detached state
       
       
  session.close();
  
  
		 
	}

}
