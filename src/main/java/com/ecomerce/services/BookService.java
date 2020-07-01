package com.ecomerce.services;

import com.ecomerce.dto.Book;

public interface BookService {

    Book saveBook(Book book);

    Book findByName(String nameBook);

    Book findByAuthor(String authorBook);

    Boolean existsBookByISBN(String isbn);


}
