package com.kodilla.kodillalibrary.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="books")
public class Book {

    @Id
    @GeneratedValue
    private Long Id;

    @Column
    private String title;

    @Column
    private String author;

    @Column
    private Integer releaseDate;
}
