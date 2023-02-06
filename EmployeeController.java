package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.Employee;
import com.app.service.EmployeeService;


@RestController
public class EmployeeController 
{
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping
	public List<Employee> getAllEmployees()
	{
		return employeeService.getAllEmployees();
	}
	
	@PostMapping
	public Employee addEmployee(@RequestBody Employee employee)
	{
		return employeeService.addEmployee(employee);
	}
	
	@PutMapping
	public Employee updateEmployee(@RequestBody Employee employee)
	{
		return employeeService.updateEmployee(employee);
	}
	
	@DeleteMapping("/{Id}")
	public String deleteEmployee(@PathVariable Long Id)
	{
		employeeService.deleteEmployee(Id);
		return "deleted emp";
	}
}
