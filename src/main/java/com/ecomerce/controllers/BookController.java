package com.ecomerce.controllers;

import com.ecomerce.dto.Book;
import com.ecomerce.services.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/book/find")
    public Book findByISBN(String isbn){
        return new Book(1L, "123-6", 1, "La Catedral");
    }

    @PostMapping("/book/update")
    public Book updarOrSave(@RequestBody  Book book){
        return bookService.saveBook(book);
    }

}
