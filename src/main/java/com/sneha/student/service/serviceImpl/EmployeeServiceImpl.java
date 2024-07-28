package com.sneha.student.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sneha.student.DTO.EmployeeDTO;
import com.sneha.student.entity.Employee;
import com.sneha.student.entity.Student;
import com.sneha.student.repository.EmployeeRepository;
import com.sneha.student.service.EmployeeService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeServiceImpl  implements EmployeeService {
@Autowired
private EmployeeRepository employeeRepository;
	@Override
	public String saveEmployee(EmployeeDTO employeeDto) {
		Employee employee = new Employee();
		employee.setSalary(employeeDto.getSalary());
		employee.setEmployeeName(employeeDto.getEmployeeName());
		employee.setCompanyName (employeeDto.getCompanyName());
		employeeRepository.save(employee);
		return "save successfully";
	}
	 	@Override
	public Employee getEmployeebyId(Long id) {
	Employee employee = employeeRepository.findById(id).get();
    return employee;
	}
		@Override
		public String updateEmployee(EmployeeDTO employeeDto) {
			Employee employee = employeeRepository.findById(employeeDto.getId()).get();
			employee.setSalary(employeeDto.getSalary());
			employee.setEmployeeName(employeeDto.getEmployeeName());
			employee.setCompanyName (employeeDto.getCompanyName());
			employeeRepository.save(employee);
			return "update successfully";
			
		}
}