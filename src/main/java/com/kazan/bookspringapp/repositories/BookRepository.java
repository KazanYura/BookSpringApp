package com.kazan.bookspringapp.repositories;

import com.kazan.bookspringapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
