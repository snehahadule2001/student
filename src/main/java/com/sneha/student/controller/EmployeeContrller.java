package com.sneha.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sneha.student.DTO.EmployeeDTO;
import com.sneha.student.entity.Employee;
import com.sneha.student.service.EmployeeService;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeContrller {
	@Autowired
	public EmployeeService employeeService;
	
	
	@PostMapping("/saveEmployee")
	public String saveemployee ( @RequestBody EmployeeDTO employeeDto) {
		return employeeService.saveEmployee(employeeDto);
	
	}
	@GetMapping("/getEmployeebyId")
	public Employee  getEmployeeById (@RequestParam Long id) {
		return employeeService.getEmployeebyId(id);
	}
	@PutMapping("/updateEmployee")
	public String updateemployee ( @RequestBody EmployeeDTO employeeDto) {
		return employeeService.updateEmployee(employeeDto);
	
}}
