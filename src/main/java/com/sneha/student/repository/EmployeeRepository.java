package com.sneha.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sneha.student.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long > {
	

}
