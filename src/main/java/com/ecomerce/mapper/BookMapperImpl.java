package com.ecomerce.mapper;

import com.ecomerce.dto.Book;
import com.ecomerce.dto.BookOutDTO;

public class BookMapperImpl implements BookMapper{
    @Override
    public BookOutDTO bookToBookDto(Book book) {
        if(book == null){
            return null;
        }
        BookOutDTO bookDTO = new BookOutDTO();
        bookDTO.setIdBook(book.getIdBook());
        bookDTO.setIsbn(book.getIsbn());
        bookDTO.setName(book.getName());
        bookDTO.setNumberOfBooks(book.getNumberOfBooks());

        return bookDTO;
    }
}
