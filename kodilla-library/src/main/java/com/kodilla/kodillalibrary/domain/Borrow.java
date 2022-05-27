package com.kodilla.kodillalibrary.domain;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
public class Borrow {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne(
            targetEntity = CopiesBook.class
    )
    private CopiesBook copieBook;

    @ManyToOne
    @JoinColumn(name = "reader")
    private Reader reader;

    @Column
    @NotNull
    private LocalDate dateOfBorrow;

    @Column
    private LocalDate dateOfReturn;

    public Borrow(CopiesBook copieBook, Reader reader, LocalDate dateOfBorrow, LocalDate dateOfReturn) {
        this.copieBook = copieBook;
        this.reader = reader;
        this.dateOfBorrow = dateOfBorrow;
        this.dateOfReturn = dateOfReturn;
    }
}
