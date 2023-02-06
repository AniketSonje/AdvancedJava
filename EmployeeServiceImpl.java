package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pojo.Employee;
import com.app.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepo;
	
	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepo.findAll();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		if(employeeRepo.existsById(employee.getId()))
			return employeeRepo.save(employee);
		return null;
	}

	@Override
	public String deleteEmployee(Long Id) {
		employeeRepo.deleteById(Id);
		return "deleted";
	}

}
