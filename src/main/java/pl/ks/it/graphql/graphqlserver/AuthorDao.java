package pl.ks.it.graphql.graphqlserver;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class AuthorDao {

    private final List<Author> authors;

    public Author getById(String id) {
        return authors.stream()
                .filter(author -> id.equals(author.id()))
                .findFirst()
                .orElseThrow(null);
    }
}