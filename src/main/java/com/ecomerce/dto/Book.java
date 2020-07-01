package com.ecomerce.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBook;
    private String isbn;
    private Integer numberOfBooks;
    private String name;

    public Book(Long idBook, String isbn, Integer numberOfBooks, String name) {
        this.idBook = idBook;
        this.isbn = isbn;
        this.numberOfBooks = numberOfBooks;
        this.name = name;
    }

}
