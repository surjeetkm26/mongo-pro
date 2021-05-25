package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.model.Department;
import com.api.repo.DepartmentRepo;

@RestController
@RequestMapping("/dept")
public class DepartmentController {
	
	@Autowired
	private DepartmentRepo departmentRepo;
	
	@RequestMapping(name = "/post",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity saveDepartment(@RequestBody Department department) {
		departmentRepo.save(department);
		System.out.println("Department Saved=================");
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	@GetMapping("/findDeptByName/{name}")
	public List findDepartmentByName(@PathVariable("name") String name) {
		System.out.println("Find Department By Name==================");
		return departmentRepo.findAll();
	}
	@GetMapping("/findDeptByEmpName/{empName}")
	public List<Department> findDepartmentByEmployeeName(@PathVariable("empName") String empName) {
		System.out.println("Find Department By EmployeeName============");
		return departmentRepo.findDepartmentByEmployeeName(empName);
	}
}
