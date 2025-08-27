package com.example.springboot_graphql;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public record Employee(Integer id, String name, Float salary) implements People{
    public static List<Employee> employees = Arrays.asList(
            new Employee(1,"Nam",1200.2f),
            new Employee(2,"Thủy",1000.2f)
    );
}
