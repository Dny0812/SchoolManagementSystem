package com.StudentManagement.System.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.StudentManagement.System.Repositary.StudentRepositary;
import com.example.Student.Management.System.dto.Student;


@RestController
public class StudentController {
	@Autowired
	StudentRepositary st;
	
	@PostMapping("/savestudent")
	public String savedata(@RequestBody Student s)
	{
		st.save(s);
		return "save";
	}
	
	@GetMapping("/getstudent")
	public Student getuser(@RequestParam int id) {
		Optional<Student> o=st.findById(id);
		Student student=o.get();
		return student;
	}
	
	
	@DeleteMapping("/deletestudent")
	public String delete(@RequestParam int id) {
		st.deleteById(id);
		return "Delete Successfully";
	}
	
	@PutMapping("/updatestudent")
	public String upadtedata(@RequestBody Student s)
	{
		st.save(s);
		return "save";
	}

}
