package com.api.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.api.model.Customer;
import com.api.repo.CustomerRepository;
import com.api.service.ProductService;

@RestController
public class ProductController {
	private static final Logger LOGGER=LoggerFactory.getILoggerFactory().getLogger("MongodbInstApplication");
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Value("${clientname}")
	private String clientname;
	
	@GetMapping("/getmsg/{name}")
	public String getMessage(@PathVariable("name") String name) {
		LOGGER.info("Controller INFO===================");
		LOGGER.debug("Controller DEBUG==================");
		return "Hello"+ name + clientname;
	}
/*	@GetMapping("/getCustByState/{state}")
	public List<String> getCustomersByState(@PathVariable("state") String state){
		LOGGER.info("Get Customers By State=================");
		List<Customer> cust1=customerRepository.getCustomersByState(state);
		List<String> list=cust1.stream().map(p->p.getFirstName()).collect(Collectors.toList());
		System.out.println(list);
		return list;
	}
**/
}
