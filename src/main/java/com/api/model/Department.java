package com.api.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Document("Department")
public class Department {
	
	@Id
	private String id;
	@Indexed(name = "deptName")
	private String name;
	private String description;
	private List employees;
}
