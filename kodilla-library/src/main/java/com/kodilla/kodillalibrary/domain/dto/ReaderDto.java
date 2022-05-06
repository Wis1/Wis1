package com.kodilla.kodillalibrary.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class ReaderDto {

    private Integer id;
    private String firstName;
    private String lastName;
    private LocalDate accountCreationDate;
}
