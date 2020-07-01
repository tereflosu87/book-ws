package com.ecomerce.repositories;

import com.ecomerce.dto.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

    Book findByName(String nameBook);

    Book findByAuthor(String authorBook);

}
