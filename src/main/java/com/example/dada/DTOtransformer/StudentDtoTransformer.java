package com.example.dada.DTOtransformer;

import com.example.dada.dto.StudentDto;

public class StudentDtoTransformer {
    

    public static StudentDto toStudentDto(Integer id, StudentDto studentDto) {
        
        return new StudentDto( studentDto.getFirstName(), studentDto.getMiddleName(), studentDto.getLastName(),id);
    }
}
