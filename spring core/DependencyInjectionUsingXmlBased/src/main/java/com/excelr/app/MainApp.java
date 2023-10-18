package com.excelr.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.excelr.model.Employee;


public class MainApp {

	public static void main(String[] args) {

		    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		    
		Employee employee =    (Employee) context.getBean("e1");
	   employee.display();
		   
		    
	}

}
