package com.kodilla.kodillalibrary.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public class BookDto {

    private Long Id;

    private String title;

    private String author;

    private Integer releaseDate;
}
