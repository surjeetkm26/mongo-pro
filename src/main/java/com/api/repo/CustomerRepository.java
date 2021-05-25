package com.api.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.api.model.Customer;
@Repository
public interface CustomerRepository extends MongoRepository<Customer, Integer>,MyRepo{

}
