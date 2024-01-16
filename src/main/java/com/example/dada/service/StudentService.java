package com.example.dada.service;
import com.example.dada.dto.StudentDto;
import com.example.dada.repository.StudentRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import java.util.List;
@RequiredArgsConstructor
@Service
public class StudentService {
	 private final StudentRepository studentRepository;


	    public List<StudentDto> getAllStudents() {
	        return studentRepository.getAll();
	    }
	    public StudentDto createStudent(StudentDto studentDto) {
	       return studentRepository.create(studentDto);
	    }
	    public StudentDto updateStudent(StudentDto student) {
	    	return studentRepository.update(student);
	    }
	    public void deleteStudent(Integer id) {
	    	studentRepository.delete(id);
	    }
}
