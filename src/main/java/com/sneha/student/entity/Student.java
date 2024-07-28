package com.sneha.student.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="neha")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="student_id")
private  Long studentId;
	@Column(name="student_name")
private  String studentName;
	@Column(name="student_email")
private  String studentEmail;
	@Column(name="student_mobile_number")
private  String studentMobileNumber;
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public String getStudentMobileNumber() {
		return studentMobileNumber;
	}
	public void setStudentMobileNumber(String studentMobileNumber) {
		this.studentMobileNumber = studentMobileNumber;
	}
	public Student(Long studentId, String studentName, String studentEmail, String studentMobileNumber) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentMobileNumber = studentMobileNumber;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	


}
