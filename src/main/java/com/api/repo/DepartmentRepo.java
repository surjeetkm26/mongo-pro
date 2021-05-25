package com.api.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.api.model.Department;

public interface DepartmentRepo extends MongoRepository<Department, String>,DepartmentCustomRepo{

}
