package com.example.springboot_graphql;

import java.util.Arrays;
import java.util.List;

public record Lawyer(Integer id, String name, String position) implements People {
    public static List<Lawyer> lawyers = Arrays.asList(
            new Lawyer(1,"Hùng","Luật sư"),
            new Lawyer(2,"Tiến","Thẩm phán")
    );
}
