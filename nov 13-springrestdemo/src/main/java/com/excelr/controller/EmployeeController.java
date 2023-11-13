package com.excelr.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.entity.Employee;
import com.excelr.service.EmployeeService;

@RestController
@RequestMapping("api/v1")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/employee")
	ResponseEntity<Employee> addEmployee(@RequestBody Employee employee)
	{
		return new ResponseEntity<Employee>(employeeService.addEmployee(employee), HttpStatus.OK);
	}
}
