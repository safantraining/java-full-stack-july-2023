package com.excelr.client;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BulkOperationDelete {

	public static void main(String[] args) {


		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
	SessionFactory factory =configuration.buildSessionFactory(); // connection will check, files will correctness
       Session session=  factory.openSession(); // open the connection with given configuration.//
                                               // It provvides the methods. to perform operation
       
    Transaction transaction =   session.beginTransaction();
    Query query=   session.createQuery("delete from Employee e where e.id>:empid");
    query.setParameter("empid", 2);
    query.executeUpdate();
    
    transaction.commit();
    System.out.println("deleted");
       
       
       session.close();
       
       
		
	}

}
