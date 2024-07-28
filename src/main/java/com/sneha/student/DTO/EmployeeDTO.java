package com.sneha.student.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDTO {
 private Long id;
 private Long salary;
 private String employeeName;
 private String companyName;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public long getSalary() {
	return salary;
}
public void setSalary(long salary) {
	this.salary = salary;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
 
}
