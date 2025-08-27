package com.example.springboot_graphql.controller;

import com.example.springboot_graphql.Author;
import com.example.springboot_graphql.AuthorConnection;
import com.example.springboot_graphql.Book;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class BookController {

    @QueryMapping
    public List<Book> books(@Argument int first) {
        return Book.books.stream().limit(first).toList();
    }
    @QueryMapping
    public Optional<Book> bookById(@Argument Integer id) {
        return Book.getBookById(id);
    }

    @SchemaMapping(typeName = "Book",field = "authors")
    public AuthorConnection getAuthors(Book book, @Argument int first,@Argument String after) {
        return Author.getAuthorId(book.authorId(),first,after);
    }


}
