package com.sneha.student.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDTO {
	private Long id;
	private String studentName;
	private String studentEmail;
	private String studentMobileNumber;
	
	
	
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	

}
