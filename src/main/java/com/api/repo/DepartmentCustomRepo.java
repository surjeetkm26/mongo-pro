package com.api.repo;

import java.util.List;

import com.api.model.Department;

public interface DepartmentCustomRepo {

	public List findAllDepartment();
	
	public List<Department> findDepartmentByEmployeeName(String empName);
	
	
}
