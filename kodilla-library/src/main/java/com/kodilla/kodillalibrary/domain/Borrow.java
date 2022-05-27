package com.kodilla.kodillalibrary.domain;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Borrows {

    @Id
    @Column
    private Long idOfCopiesBook;

    @ManyToOne
    @Column
    @NotNull
    @JoinColumn(name = "raaderId")
    private Reader reader;

    @Column
    @NotNull
    private LocalDate dateOfBorrow;

    @Column
    private LocalDate dateOfReturn;
}
