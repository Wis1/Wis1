package com.kodilla.kodillalibrary.domain;

import com.sun.istack.NotNull;
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
    @NotNull
    private String title;

    @Column
    @NotNull
    private String author;

    @Column
    @NotNull
    private Integer releaseDate;
}
