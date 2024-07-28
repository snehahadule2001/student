package com.sneha.student.service;

import com.sneha.student.DTO.EmployeeDTO;
import com.sneha.student.entity.Employee;

public interface EmployeeService {

	String saveEmployee(EmployeeDTO employeeDto);

	Employee getEmployeebyId(Long id);

	String updateEmployee(EmployeeDTO employeeDto);



	

}
