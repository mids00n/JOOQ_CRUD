package com.example.dada.dto;

import lombok.Builder;
import lombok.Data;

@Data

public class StudentDto {
	private String firstName;
	private String middleName;
	private String lastName;
	private Integer id;
	
	   public StudentDto(String firstName, String middleName, String lastName,Integer id  ) {
	        this.firstName = firstName;
	        this.middleName = middleName;
	        this.lastName = lastName;
	        this.id = id;
	    }
}