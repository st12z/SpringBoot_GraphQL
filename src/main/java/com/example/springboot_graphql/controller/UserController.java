package com.example.springboot_graphql.controller;

import com.example.springboot_graphql.dto.UserDto;
import com.example.springboot_graphql.dto.UserRequestDto;
import com.example.springboot_graphql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @MutationMapping
    public UserDto createUser(@Argument UserRequestDto userRequestDto) {
        return userService.createUser(userRequestDto);
    }
}
