package com.rs.springframework.spring5webapp.repositories;

import com.rs.springframework.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by rs on 1/15/2018.
 */
public interface BookRepository extends CrudRepository<Book, Long>{
}
