package com.excelr.app;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.excelr.entity.Dept;
import com.excelr.entity.Employee;

public class OneToManyDemo {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		 
	 SessionFactory factory =configuration.buildSessionFactory();
	   Session session = factory.openSession();
	 Transaction transaction =    session.beginTransaction();
	  
	 Dept dept = new Dept();
	 dept.setName("developer");
	 dept.setManager("ram");
	  //session.save(dept);
	   
	   Employee employee = new Employee("parul", 56000, 23, dept);
	   Employee employee2 = new Employee("kiran", 80000, 24, dept);
	   Employee employee3 = new Employee("gopi", 72000, 31, dept);

	   session.saveOrUpdate(employee);
	   session.saveOrUpdate(employee2);
	   session.saveOrUpdate(employee3);
	  
	   transaction.commit();
	   session.close();
	}

}
