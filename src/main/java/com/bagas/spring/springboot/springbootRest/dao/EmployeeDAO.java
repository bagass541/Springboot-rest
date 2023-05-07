package com.bagas.spring.springboot.springbootRest.dao;

import java.util.List;

import com.bagas.spring.springboot.springbootRest.entity.Employee;



public interface EmployeeDAO {
	public List<Employee> getAllEmployees();

	public void saveEmployee(Employee employee);

	public Employee getEmployee(int id);

	public void deleteEmployee(int id);
}
