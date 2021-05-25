package com.api.repo;

import java.util.List;

import com.api.model.Customer;

public interface MyRepo {

	List<Customer> getCustomersByState(String state);
}
