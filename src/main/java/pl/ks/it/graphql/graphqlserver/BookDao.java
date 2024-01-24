package pl.ks.it.graphql.graphqlserver;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class BookDao {

    private final List<Book> books;

    public Book getById(String id) {
        return books.stream()
                .filter(book -> book.id().equals(id))
                .findFirst()
                .orElse(null);
    }
}