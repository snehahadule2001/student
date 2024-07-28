package com.sneha.student.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sneha.student.DTO.StudentDTO;
import com.sneha.student.entity.Student;
import com.sneha.student.repository.StudentRepository;
import com.sneha.student.service.StudentService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StudentServiceImpl implements StudentService{
@Autowired
private StudentRepository studentRepository;
	@Override
	public String saveStudent(StudentDTO studentDto) {
		Student student=new Student();
		student.setStudentName(studentDto.getStudentName());
		student.setStudentEmail(studentDto.getStudentEmail());
		student.setStudentMobileNumber(studentDto.getStudentMobileNumber());
		studentRepository.save(student);
		return "Saved Successfully";
	}
	@Override
	public Student getStudentById(Long id) {
		Student student = studentRepository.findById(id).get();
		return student;
		
	}
	@Override
	public String updateStudent(StudentDTO studentDTO) {
		Student student = studentRepository.findById(studentDTO.getId()).get();
		student.setStudentName(studentDTO.getStudentName());
		student.setStudentEmail(studentDTO.getStudentEmail());
		student.setStudentMobileNumber(studentDTO.getStudentMobileNumber());
		studentRepository.save(student);
		return "updated Successfully";
	}
	@Override
	public String deletStudent(Long id) {
		studentRepository.deleteById(id);
		return "deleted successfully";
	}

}
