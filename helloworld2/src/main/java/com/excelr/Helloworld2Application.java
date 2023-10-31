package com.excelr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.excelr.entity.Employee;
import com.excelr.repository.EmployeeRepository;

@SpringBootApplication
public class Helloworld2Application implements CommandLineRunner{

	@Autowired
	EmployeeRepository employeeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Helloworld2Application.class, args);
		
	}

	
	@Override
	public void run(String... args) throws Exception {
		
		
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("rohit");
		employee.setDept("hr");
		employee.setAge(23);
		employee.setSalary(56000);
		
		employeeRepository.save(employee);
		
		
	}

}
