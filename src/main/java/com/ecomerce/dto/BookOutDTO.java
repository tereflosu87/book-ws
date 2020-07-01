package com.ecomerce.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
//@NoArgsConstructor
public class BookOutDTO {

    private Long idBook;
    private String isbn;
    private Integer numberOfBooks;
    private String name;

    public BookOutDTO(Long idBook, String isbn, Integer numberOfBooks, String name) {
        this.idBook = idBook;
        this.isbn = isbn;
        this.numberOfBooks = numberOfBooks;
        this.name = name;
    }

    public BookOutDTO(){}

}
