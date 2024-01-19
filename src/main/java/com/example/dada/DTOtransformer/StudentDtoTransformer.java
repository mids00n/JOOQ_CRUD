package com.example.dada.DTOtransformer;

import com.example.dada.dto.StudentDto;

public class StudentDtoTransformer {
    

    public static StudentDto toStudentDto(Integer id, String firstname, String middlename, String lastname) {
        return StudentDto.builder()
                .id(id)
                .firstName(firstname)
                .middleName(middlename)
                .lastName(lastname)
                .build();
    }

    public static StudentDto toStudentDto(Integer id, StudentDto studentDto) {
        return toStudentDto(id, studentDto.getFirstName(), studentDto.getMiddleName(), studentDto.getLastName());
    }

}
