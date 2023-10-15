package com.excelr.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.excelr.persistance.Employee;

public class UpdateDemoClient {

	public static void main(String[] args) {

		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
	SessionFactory factory =	configuration.buildSessionFactory(); // connection will check, files will correctness
       Session session=  factory.openSession(); // open the connection with given configuration.//
                                               // It provvides the methods. to perform operation
       // loading from database
    Employee emp =  session.load(Employee.class, 3);
     
   Transaction transaction =  session.beginTransaction();
   emp.setSalary(70000);
   emp.setAge(35);
   emp.setDept("manager");
   session.update(emp);
    
     transaction.commit();
     System.out.println("record updated");
     
	}

}
