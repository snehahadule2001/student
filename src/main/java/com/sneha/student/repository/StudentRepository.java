package com.sneha.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sneha.student.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
