package com.app.service;

import java.util.List;

import com.app.pojo.Employee;

public interface EmployeeService 
{
	List<Employee> getAllEmployees();
	
	Employee addEmployee(Employee employee);
	
	Employee updateEmployee(Employee employee);
	
	String deleteEmployee(Long Id);
}
