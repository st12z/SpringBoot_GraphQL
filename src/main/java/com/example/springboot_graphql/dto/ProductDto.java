package com.example.springboot_graphql.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {
    private String name;

    private String category;

    private Float price;

    private Integer stock;
}
