package com.kodilla.kodillalibrary.domain;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
public class CopiesBook {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    @JoinColumn(name = "borrow")
    private Borrow borrow;

    @ManyToOne
    @JoinColumn(name="book")
    @NotNull
    private Book book;

    @Column
    private String status;

    public CopiesBook(Book book, String status) {
        this.book = book;
        this.status = status;
    }
}
