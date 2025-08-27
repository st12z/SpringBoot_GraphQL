package com.example.springboot_graphql.service;

import com.example.springboot_graphql.dto.UserDto;
import com.example.springboot_graphql.dto.UserRequestDto;
import com.example.springboot_graphql.entity.User;
import com.example.springboot_graphql.repository.RoleRepository;
import com.example.springboot_graphql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    @Autowired
    private RoleRepository roleRepository;
    public UserDto createUser(UserRequestDto userRequestDto) {
        User user = User.builder()
                .password(passwordEncoder.encode(userRequestDto.getPassword()))
                .username(userRequestDto.getUsername())
                .roles(List.of(Objects.requireNonNull(roleRepository.findById(1).orElse(null))))
                .build();
        user = userRepository.save(user);
        return UserDto.builder()
                .username(user.getUsername())
                .id(user.getId())
                .build();

    }
}
