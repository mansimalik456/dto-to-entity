package com.entityTODto.domains;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "Employee")
@NoArgsConstructor
public @Data class Employee {
	
	@Id
	private String id;
	
	@Indexed(unique = true)
	private long empId;
	private String firstName;
	private String lastName;
	
	private String empPost;
	private String salary;
	private LocalDateTime jobStarted;
	

}
