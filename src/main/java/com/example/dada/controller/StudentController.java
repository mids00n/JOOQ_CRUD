package com.example.dada.controller;

import com.example.dada.DTOtransformer.StudentDtoTransformer;
import com.example.dada.dto.StudentDto;
import com.example.dada.service.StudentService;
import static com.example.dada.DTOtransformer.StudentDtoTransformer.toStudentDto;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;	
@RequiredArgsConstructor
@RestController
@RequestMapping("/students")
public class StudentController {
	 private final StudentService studentService;

	    @GetMapping
	    public List<StudentDto> getAllStudents() {
	        return studentService.getAllStudents();
	    }
	    
	    @PostMapping
	    public StudentDto create(@RequestBody StudentDto student) {
            return studentService.createStudent(student);
    }
	    
	    @PutMapping("/{id}")
	    public StudentDto update(@PathVariable Integer id, @RequestBody StudentDto student) {
	        return studentService.updateStudent(toStudentDto(id, student));
	    }
	    @DeleteMapping("{id}")
	    public ResponseEntity<String> delete(@PathVariable Integer id) {
	            studentService.deleteStudent(id);
	            return new ResponseEntity<>("Student deleted successfully", HttpStatus.OK);
	    }
}
