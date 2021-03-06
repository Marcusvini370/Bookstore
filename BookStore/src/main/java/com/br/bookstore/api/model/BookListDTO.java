package com.br.bookstore.api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Setter
@Getter
public class BookListDTO {
    List<BookDTO> bookDTOList;
}