package com.excelr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelr.entity.Department;
import com.excelr.entity.Employee;
import com.excelr.repository.DepartmentRepository;
import com.excelr.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl  implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
    DepartmentRepository departmentRepository;
	
	@Override
	public Employee addEmployee(Employee employee) {
		
		Department department = departmentRepository.findById(employee.getDepartment().getId()).orElse(null);
		if(department==null)
		{
			department = new Department();
			department.setName(employee.getDepartment().getName());
			department.setManager(employee.getDepartment().getManager());
			
		}
		
		
		employee.setDepartment(department);
		
		//departmentRepository.save(department);
		return employeeRepository.save(employee);
	}

}
