package com.ecomerce.mapper;

import com.ecomerce.dto.Book;
import com.ecomerce.dto.BookOutDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    BookOutDTO bookToBookDto(Book book);
}
