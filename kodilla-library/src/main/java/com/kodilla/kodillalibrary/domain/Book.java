package com.kodilla.kodillalibrary.domain;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

    @OneToMany(
                targetEntity = CopiesBook.class,
                mappedBy = "book",
                cascade = CascadeType.MERGE,
                fetch = FetchType.LAZY
    )
    private List<CopiesBook> copiesBooks= new ArrayList<>();

    public Book(Long id, String title, String author, Integer releaseDate) {
        Id = id;
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
    }
}
