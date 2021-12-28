package com.java.spring.mockito.controller;

import com.java.spring.mockito.model.Employee;
import com.java.spring.mockito.model.Response;
import com.java.spring.mockito.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/EmployeeService")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/addEmployee")
    public Response addEmployee(@RequestBody Employee employee) {
        employeeRepository.save(employee);
        return new Response(employee.getId() + " inserted", Boolean.TRUE);
    }

    @GetMapping("/getEmployees")
    public Response getAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        return new Response("record counts : " + employees.size(), Boolean.TRUE);
    }
}