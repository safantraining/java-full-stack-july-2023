package com.excelr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excelr.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
