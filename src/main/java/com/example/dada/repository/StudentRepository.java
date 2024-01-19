package com.example.dada.repository;

import java.util.List;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import static com.example.generated.tables.Student.STUDENT;
import com.example.dada.dto.StudentDto;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Repository
public class StudentRepository {
    private final DSLContext dslContext;
    var st = STUDENT.as("st");
    public List<StudentDto> getAll() {
        return dslContext.select().from(st).fetchInto(StudentDto.class);
    }

    public StudentDto create(StudentDto studentDto) {
    	return dslContext
        .insertInto(st)
        .set(st.FIRST_NAME, studentDto.getFirstName())
        .set(st.MIDDLE_NAME, studentDto.getMiddleName())
        .set(st.LAST_NAME, studentDto.getLastName())
        .returning()
        .fetchOneInto(StudentDto.class); 
    }

    public StudentDto update(StudentDto studentDto) {
    	return dslContext
                .update(st)
                .set(st.FIRST_NAME, studentDto.getFirstName())
                .set(st.MIDDLE_NAME, studentDto.getMiddleName())
                .set(st.LAST_NAME, studentDto.getLastName())
                .where(st.ID.eq(studentDto.getId()))
                .returning()
                .fetchOneInto(StudentDto.class); 
    }
    public void delete(Integer id) {
        dslContext
            .deleteFrom(st)
            .where(st.ID.eq(id))
            .execute();
    }
}