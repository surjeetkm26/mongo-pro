package com.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Document("Employee")
public class Employee {
	
	@Id
	private int empId;
	private String name;
	private int age;
	private double salary;
}
