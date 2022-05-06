package com.kodilla.kodillalibrary.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
//@Entity
public class Borrows {

    @Id
    @Column
    private Long idOfCopiesBook;

    @Column
    private Long idOfReader;

    @Column
    private LocalDate dateOfBorrow;

    @Column
    private LocalDate dateOfReturn;
}
