package com.example.springboot_graphql.repository;

import com.example.springboot_graphql.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    List<Product> findByCategory(String category);
}
