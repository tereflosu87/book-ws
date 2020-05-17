package com.ecomerce.dtoAPI;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookResponse {

    private Long idBook;
    private String isbn;
    private Integer numberOfBooks;
    private String name;

    public BookResponse(Long idBook, String isbn, Integer numberOfBooks, String name) {
        this.idBook = idBook;
        this.isbn = isbn;
        this.numberOfBooks = numberOfBooks;
        this.name = name;
    }

}
