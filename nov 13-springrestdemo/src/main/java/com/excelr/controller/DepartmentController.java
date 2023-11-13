package com.excelr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.entity.Department;
import com.excelr.repository.DepartmentRepository;

@RestController
@RequestMapping("/api/v1")
public class DepartmentController {

	@Autowired
	DepartmentRepository departmentRepository;
	
	@PostMapping("/department")
	public Department addDepartment(@RequestBody Department department)
	{
		return departmentRepository.save(department);
	}
	
}
