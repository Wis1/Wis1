package com.kodilla.kodillalibrary.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name= "reader")
public class Reader {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private LocalDate accountCreationDate;

    @OneToMany(
            targetEntity = Borrow.class,
            mappedBy = "reader",
            cascade = CascadeType.MERGE,
            fetch = FetchType.LAZY
    )
    private List<Borrow> borrowList = new ArrayList<>();

    public Reader(Integer id, String firstName, String lastName, LocalDate accountCreationDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountCreationDate = accountCreationDate;
    }
}
