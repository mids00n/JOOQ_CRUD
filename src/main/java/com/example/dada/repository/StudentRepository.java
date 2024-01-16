package com.example.dada.repository;

import java.util.List;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
//import static com.example.dada.db.com.example.generated.tables.Student.STUDENT;
import static com.example.generated.tables.Student.STUDENT;
import com.example.dada.dto.StudentDto;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Repository
public class StudentRepository {
    private final DSLContext dslContext;
  
    public List<StudentDto> getAll() {
        return dslContext.select().from(STUDENT).fetchInto(StudentDto.class);
    }

    public StudentDto create(StudentDto studentDto) {
    	return dslContext
        .insertInto(STUDENT)
        .set(STUDENT.FIRST_NAME, studentDto.getFirstName())
        .set(STUDENT.MIDDLE_NAME, studentDto.getMiddleName())
        .set(STUDENT.LAST_NAME, studentDto.getLastName())
        .returning()
        .fetchOneInto(StudentDto.class); 
    }

    public StudentDto update(StudentDto studentDto) {
    	return dslContext
                .update(STUDENT)
                .set(STUDENT.FIRST_NAME, studentDto.getFirstName())
                .set(STUDENT.MIDDLE_NAME, studentDto.getMiddleName())
                .set(STUDENT.LAST_NAME, studentDto.getLastName())
                .where(STUDENT.ID.eq(studentDto.getId()))
                .returning()
                .fetchOneInto(StudentDto.class); 
    }
    public void delete(Integer id) {
        dslContext
            .deleteFrom(STUDENT)
            .where(STUDENT.ID.eq(id))
            .execute();
    }
}