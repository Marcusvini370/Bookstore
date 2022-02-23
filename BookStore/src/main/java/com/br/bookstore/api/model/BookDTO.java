package com.br.bookstore.api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class BookDTO {

    private Integer id;
    private String name;
    private String description;
    private String author;
    private String genre;

}
