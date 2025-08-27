package com.example.springboot_graphql;

import com.example.springboot_graphql.entity.Product;
import com.example.springboot_graphql.repository.CategoryRepository;
import com.example.springboot_graphql.repository.ProductRepository;
import com.example.springboot_graphql.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringbootGraphqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootGraphqlApplication.class, args);
	}

}
