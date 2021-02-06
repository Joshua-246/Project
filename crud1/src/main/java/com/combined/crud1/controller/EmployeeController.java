package com.combined.crud1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.combined.crud1.dao.EmployeeDao;
import com.combined.crud1.model.Employee;
@RestController
@RequestMapping("/company")
public class EmployeeController {
	@Autowired
	EmployeeDao ed;
	
	@PostMapping("/employee")
	public Employee addEmp(@RequestBody Employee e) {
		return ed.addE(e);
	}
	@GetMapping("/employee")
	public List<Employee> getAllEmp() {
		return ed.getAllE();
	}
	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee> getEmp(@PathVariable Long id) {
		Employee e1 = ed.getEById(id);
		if(e1==null) {
			return ResponseEntity.notFound().build();
		}
		else {
			return ResponseEntity.ok().body(e1);
		}
	}
	@DeleteMapping("/employee/{id}")
	public ResponseEntity<Employee> deleteEmp(@PathVariable Long id) {
		Employee e2 = ed.getEById(id);
		if(e2==null) {
			return ResponseEntity.notFound().build();
		}
		ed.deleteE(e2);
		return ResponseEntity.ok().build();
	}
	@PutMapping("/employee/{id}")
	public  ResponseEntity<Employee> updateEmp(@PathVariable Long id,@RequestBody Employee e) {
		Employee e3 = ed.getEById(id);
		if(e3==null) {
			return ResponseEntity.notFound().build();
		}
		e3.setName(e.getName());
		e3.setDesignation(e.getDesignation());
		e3.setExpertise(e.getExpertise());
		ed.updateE(e3); 
		return ResponseEntity.ok().body(e3);
	}	
}
