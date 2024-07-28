package com.sneha.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sneha.student.DTO.StudentDTO;
import com.sneha.student.entity.Student;
import com.sneha.student.service.StudentService;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
	 @Autowired
	private StudentService studentService;
	 
@PostMapping("/saveStudent")	 
public String saveStudent(@RequestBody StudentDTO studentDto) {
	return studentService.saveStudent(studentDto);
	
}
@GetMapping("/getStudentById")
public Student  getStudentByIdStudent(@RequestParam Long id) {
	return studentService.getStudentById(id);
	
}
@PutMapping("/updateStudent")
public String updatestudent (@RequestBody StudentDTO studentDTO) {
	return studentService.updateStudent(studentDTO);
}
@DeleteMapping("/deleteStudentById")
public String deletStudentById (@RequestParam Long studentId) {
	return studentService.deletStudent(studentId);
}
}
