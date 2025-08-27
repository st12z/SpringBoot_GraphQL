package com.example.springboot_graphql.service;

import com.example.springboot_graphql.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService implements PeopleService<Employee>{
    @Override
    public List<Employee> getList() {
        return Employee.employees;
    }
}
