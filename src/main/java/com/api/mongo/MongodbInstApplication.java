package com.api.mongo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.api.model.Customer;
import com.api.repo.CustomerRepository;

@SpringBootApplication
@ComponentScan(basePackages = {"com.api.controller","com.api.repo","com.api.model.Product","com.api.service","com.api.config"})
@EnableMongoRepositories(basePackages = {"com.api.repo"})
public class MongodbInstApplication implements CommandLineRunner{
	private static final Logger LOGGER=LoggerFactory.getILoggerFactory().getLogger("MongodbInstApplication");
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MongodbInstApplication.class, args);
		
	}
	@Override
	public void run(String... args) throws Exception {
		
		
	}
}
