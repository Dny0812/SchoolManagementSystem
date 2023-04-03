package com.StudentManagement.System.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Student.Management.System.dto.Student;


public interface StudentRepositary extends JpaRepository<Student, Integer> {
	

}

