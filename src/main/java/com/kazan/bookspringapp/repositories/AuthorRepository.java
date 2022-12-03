package com.kazan.bookspringapp.repositories;

import com.kazan.bookspringapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
