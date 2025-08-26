package com.example.springboot_graphql;

import com.example.springboot_graphql.entity.Product;
import com.example.springboot_graphql.repository.ProductRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringbootGraphqlApplication {

	@Autowired
	private ProductRepository productRepository;

	@PostConstruct
	public void initDB(){
		List<Product> products = Stream.of(
				new Product("Laptop","Electronics",74999.99f,50),
				new Product("Smartphone","Electronics",39999.99f,100),
				new Product("Office chair","Furniture",74999.99f,50),
				new Product("Notebook","Supplies",74999.99f,50),
				new Product("Desk Lamp","Furniture",74999.99f,50),
				new Product("Watter bottle","Electronics",74999.99f,50)
		).toList();
		productRepository.saveAll(products);
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootGraphqlApplication.class, args);
	}

}
