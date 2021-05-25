package com.api.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.api.model.Customer;

public class MyRepoImpl implements MyRepo {

	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public List<Customer> getCustomersByState(String state) {
		Query query=new Query();
		query.addCriteria(Criteria.where("state").is(state));
		List<Customer> custs=mongoTemplate.find(query, Customer.class);
		return custs;
	}
}
