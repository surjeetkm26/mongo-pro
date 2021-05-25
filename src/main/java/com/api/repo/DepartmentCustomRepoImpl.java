package com.api.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.api.model.Department;

public class DepartmentCustomRepoImpl implements DepartmentCustomRepo{
	
	@Autowired
	private MongoTemplate mongoTemplate;
	

	@Override
	public List<Department> findAllDepartment() {
		return mongoTemplate.findAll(Department.class);
	}

	@Override
   // @Query(value = "{'employees.name': ?0}", fields = "{'employees' : 0}")
	public List<Department> findDepartmentByEmployeeName(String empName) {
		Query query=new Query();
		query.addCriteria(Criteria.where("employees.name").is(empName));
		return mongoTemplate.find(query, Department.class);
		
		
	}

	
}
