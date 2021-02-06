package com.combined.crud1.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.combined.crud1.model.Employee;
import com.combined.crud1.repository.EmployeeRepository;
@Service
public class EmployeeDao {
	@Autowired
	EmployeeRepository emp;
	
	public Employee addE(Employee e) {
		return emp.save(e);
	}
	
	public Employee getEById(Long id) {
		return emp.findById(id).orElse(null);
	}
	
	public List<Employee> getAllE() {
		return emp.findAll();
	}
	
	public Employee updateE(Employee e) {
		return emp.save(e);
	}
	public void deleteE(Employee e) {
		emp.delete(e);
	}
}
