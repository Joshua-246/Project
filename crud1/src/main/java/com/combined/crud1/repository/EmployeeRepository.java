package com.combined.crud1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.combined.crud1.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
