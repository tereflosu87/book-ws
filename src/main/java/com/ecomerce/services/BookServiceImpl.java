package com.ecomerce.services;

import com.ecomerce.dto.Book;
import com.ecomerce.repositories.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book saveBook(Book book){
        return bookRepository.save(book);
    }

    public Book findByName(String nameBook){
        return bookRepository.findByName(nameBook);
    }

    public Book findByAuthor(String authorBook) {
        return bookRepository.findByAuthor(authorBook);
    }

    public Boolean existsBookByISBN(String isbn){
        return bookRepository.existsById(Long.valueOf(isbn));
    }

}
