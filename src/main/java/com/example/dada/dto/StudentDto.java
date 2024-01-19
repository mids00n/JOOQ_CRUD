package com.example.dada.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class StudentDto {
	private String firstName;
	private String middleName;
	private String lastName;
	private Integer id;
	
}