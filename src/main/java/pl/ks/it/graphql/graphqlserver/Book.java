package pl.ks.it.graphql.graphqlserver;

public record Book(String id, String name, int pageCount, String authorId) {
}