package pl.ks.it.graphql.graphqlserver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class Config {

    @Bean
    public BookDao bookDao() {
        List<Book> books = Arrays.asList(
                new Book("book-1", "Effective Java", 416, "author-1"),
                new Book("book-2", "Hitchhiker's Guide to the Galaxy", 208, "author-2"),
                new Book("book-3", "Down Under", 436, "author-3")
        );

        return new BookDao(books);
    }

    @Bean
    public AuthorDao authorDao() {
        List<Author> authors = Arrays.asList(
                new Author("author-1", "Joshua", "Bloch"),
                new Author("author-2", "Douglas", "Adams"),
                new Author("author-3", "Bill", "Bryson")
        );
        return new AuthorDao(authors);
    }

}