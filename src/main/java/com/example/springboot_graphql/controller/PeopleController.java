package com.example.springboot_graphql.controller;

import com.example.springboot_graphql.People;
import com.example.springboot_graphql.service.EmployeeService;
import com.example.springboot_graphql.service.LawyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PeopleController {

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private LawyerService lawyerService;
    @QueryMapping
    public List<? extends People> getPeoples(@Argument String typePeople){
        if(typePeople.equals("employee")){
            return employeeService.getList();
        }
        else{
            return lawyerService.getList();
        }
    }
}
