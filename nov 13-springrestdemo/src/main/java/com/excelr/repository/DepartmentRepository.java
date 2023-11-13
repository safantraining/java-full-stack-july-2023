package com.excelr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excelr.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
