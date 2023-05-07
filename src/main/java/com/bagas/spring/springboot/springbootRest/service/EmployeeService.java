package com.bagas.spring.springboot.springbootRest.service;

import java.util.List;

import com.bagas.spring.springboot.springbootRest.entity.Employee;



public interface EmployeeService {
	
	public List<Employee> getAllEmployees();
	
	public void saveEmployee(Employee employee);
	
	public Employee getEmployee(int id);
	
	public void deleteEmployee(int id);
	
}
