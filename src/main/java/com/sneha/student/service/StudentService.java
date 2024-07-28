package com.sneha.student.service;

import com.sneha.student.DTO.StudentDTO;
import com.sneha.student.entity.Student;

public interface StudentService {

	String saveStudent(StudentDTO studetDto);

	Student getStudentById(Long id);

	String updateStudent(StudentDTO studentDTO);

	String deletStudent(Long id);

}
