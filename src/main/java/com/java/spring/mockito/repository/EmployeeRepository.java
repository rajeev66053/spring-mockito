package com.java.spring.mockito.repository;

import com.java.spring.mockito.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}