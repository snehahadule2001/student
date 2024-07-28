package com.sneha.student.entity;

import org.hibernate.annotations.GeneratorType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="employee")
public class Employee {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="salary")
	private Long salary;
	@Column(name="companyName")
	private String companyName;
	@Column(name="employeeName")
	private String employeeName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
