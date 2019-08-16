package com.luv2code.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	private List<Student> students;
	
	// define @PostConstruct to load the students data ... only once!
	@PostConstruct
	public void loadData() {
		
		students = new ArrayList<>();
		
		students.add(new Student("Fernando", "Mendes"));
		students.add(new Student("Thaysa", "Maciel"));
		students.add(new Student("Mary", "Smith"));
	}
	
	// define endpoint for "/students" - return list of students
	@GetMapping("/students")
	public List<Student> getStudents() {		
		return students;
	}
	
	// define endpoint for "/student/{studentId}" - return a single student by id
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable Integer studentId) {
		
		// just index into the list ... keep it simple for now
		
		// check the studentID against list size
		if( (studentId >= students.size() || studentId < 0)) {
			throw new StudentNotFoundException("Student id not found - " + studentId);
		}
		return students.get(studentId);
	}
}
