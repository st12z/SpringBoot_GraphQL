package com.example.springboot_graphql.service;

import com.example.springboot_graphql.Lawyer;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LawyerService implements PeopleService<Lawyer> {
    @Override
    public List<Lawyer> getList() {
        return Lawyer.lawyers;
    }
}
