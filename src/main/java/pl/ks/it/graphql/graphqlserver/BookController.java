package pl.ks.it.graphql.graphqlserver;

import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class BookController {

    private final BookDao bookDao;
    private final AuthorDao authorDao;

    @QueryMapping
    public Book bookById(@Argument String id) {
        return bookDao.getById(id);
    }

    @SchemaMapping
    public Author author(Book book) {
        return authorDao.getById(book.authorId());
    }

// it can be also specified that we want to get data for field 'author' from type 'Book'
// by default as higher it is resolved by method name -> 'author' and an argument of type -> 'Book'
//    @SchemaMapping(typeName="Book", field="author")
//    public Author getAuthor(Book book) {
//        return authorDao.getById(book.authorId());
//    }

}