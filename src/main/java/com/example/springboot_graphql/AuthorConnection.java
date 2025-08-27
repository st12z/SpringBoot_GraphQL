package com.example.springboot_graphql;

import java.util.List;

public record AuthorConnection(Integer totalCount,List<AuthorEdge> edges, PageInfo pageInfo) {
}
