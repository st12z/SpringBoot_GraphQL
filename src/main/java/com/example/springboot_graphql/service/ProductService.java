package com.example.springboot_graphql.service;

import com.example.springboot_graphql.entity.Product;
import com.example.springboot_graphql.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository propertyRepository;

    public List<Product> getAll() {
        return propertyRepository.findAll();
    }

    public List<Product> getProductsByCategory(String category) {
        return propertyRepository.findByCategory(category);
    }

    public Product updateStock(@Argument int id, @Argument int stock){
        Product existProduct = propertyRepository.findById(id).orElseThrow(()-> new RuntimeException("Product with id not found"));
        existProduct.setStock(stock);
        return propertyRepository.save(existProduct);
    }
}
