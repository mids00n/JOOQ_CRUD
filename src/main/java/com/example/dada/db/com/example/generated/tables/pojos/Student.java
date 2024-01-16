/*
 * This file is generated by jOOQ.
 */
package com.example.generated.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final Integer id;

    public Student(Student value) {
        this.firstName = value.firstName;
        this.middleName = value.middleName;
        this.lastName = value.lastName;
        this.id = value.id;
    }

    public Student(
        String firstName,
        String middleName,
        String lastName,
        Integer id
    ) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.id = id;
    }

    /**
     * Getter for <code>public.student.first_name</code>.
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Getter for <code>public.student.middle_name</code>.
     */
    public String getMiddleName() {
        return this.middleName;
    }

    /**
     * Getter for <code>public.student.last_name</code>.
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Getter for <code>public.student.id</code>.
     */
    public Integer getId() {
        return this.id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Student (");

        sb.append(firstName);
        sb.append(", ").append(middleName);
        sb.append(", ").append(lastName);
        sb.append(", ").append(id);

        sb.append(")");
        return sb.toString();
    }
}
