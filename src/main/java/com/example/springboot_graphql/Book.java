package com.example.springboot_graphql;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Book(Integer id,
                   String name,
                   Integer pageCount,
                   Integer authorId) {
    public static List<Book> books = Arrays.asList(
            new Book(1,"Quran",604,1),
            new Book(2,"Harry Potter",1000,2),
            new Book(3,"Spring boot",1000,2),
            new Book(4,"Foo bar",400,1),
            new Book(5,"Quran",604,1),
            new Book(6,"Harry Potter",1000,2),
            new Book(7,"Spring boot",1000,2),
            new Book(8,"Foo bar",400,1),
            new Book(9,"Quran",604,1),
            new Book(10,"Harry Potter",1000,2),
            new Book(11,"Spring boot",1000,2),
            new Book(12,"Foo bar",400,1)
    );

    public static Optional<Book> getBookById(Integer id) {
        return books.stream().filter(b->b.id.equals(id))
                .findFirst();
    }
}
