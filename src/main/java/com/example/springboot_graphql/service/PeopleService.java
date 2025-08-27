package com.example.springboot_graphql.service;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PeopleService<T> {
    public List<T> getList();
}
