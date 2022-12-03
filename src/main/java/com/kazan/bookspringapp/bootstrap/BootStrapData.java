package com.kazan.bookspringapp.bootstrap;

import com.kazan.bookspringapp.domain.Author;
import com.kazan.bookspringapp.domain.Book;
import com.kazan.bookspringapp.repositories.AuthorRepository;
import com.kazan.bookspringapp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author author = new Author("Someone", "SomeLastName");
        Book book1 = new Book("Name", "123");
        author.getBooks().add(book1);
        book1.getAuthors().add(author);

        authorRepository.save(author);
        bookRepository.save(book1);

        Author authorOld = new Author("SomeoneOlde", "SomeLastOldName");
        Book bookOld = new Book("NameOld", "123");
        authorOld.getBooks().add(bookOld);
        bookOld.getAuthors().add(authorOld);

        authorRepository.save(authorOld);
        bookRepository.save(bookOld);
    }
}
