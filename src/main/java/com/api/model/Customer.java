package com.api.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
@Document
public class Customer {
	@Id
	private ObjectId _id;
	@Indexed(name = "firstname_indexed",direction = IndexDirection.DESCENDING)
	private String firstName;
	@Indexed(name = "lastname_indexed",expireAfterSeconds = 60)
	private String lastName;
	private String companyName;
	private String address;
	private String city;
	private String state;
	private String phoneNo;
	private String email;
	private String webSite;
}
