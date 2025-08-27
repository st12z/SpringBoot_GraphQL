package com.example.springboot_graphql;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Author(Integer id, String name) {
    public static List<Author> authors= Arrays.asList(
            new Author(1,"Mana sama"),
            new Author(2,"Jamila"),
            new Author(1,"Mana sama"),
            new Author(2,"Jamila"),
            new Author(1,"Mana sama"),
            new Author(2,"Jamila"),
            new Author(1,"Mana sama"),
            new Author(2,"Jamila"),
            new Author(1,"Mana sama"),
            new Author(2,"Jamila"),
            new Author(1,"Mana sama"),
            new Author(2,"Jamila"),
            new Author(1,"Mana sama"),
            new Author(2,"Jamila"),
            new Author(1,"Mana sama"),
            new Author(2,"Jamila"),
            new Author(1,"Mana sama"),
            new Author(2,"Jamila"),
            new Author(1,"Mana sama"),
            new Author(2,"Jamila"),
            new Author(1,"Mana sama"),
            new Author(2,"Jamila"),
            new Author(1,"Mana sama"),
            new Author(2,"Jamila")
    );
    public static AuthorConnection getAuthorId(Integer id, int first, String after) {
        int startIndex = 0;
        if (after != null) {
            // cursor = "cursor-<index>"
            startIndex = Integer.parseInt(after.split("-")[1]) + 1;
        }
        List<Author> all = Author.authors.stream().filter(a->a.id.equals(id)).toList();
        List<AuthorEdge> edges = new ArrayList<>();
        for(int i=startIndex;i<Math.min(all.size(),startIndex+first);i++) {
            edges.add(new AuthorEdge(all.get(i),String.format("cursor-%d", i)));
        }
        String endCursor = edges.isEmpty() ? null : edges.get(edges.size()-1).cursor();
        Boolean hasNexPage = startIndex+first<all.size();
        return new AuthorConnection(all.size(),edges,new PageInfo(endCursor,hasNexPage));
    }
}
