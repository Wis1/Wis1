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

    @Column
    @NotNull
    private Long idOfTitle;

    @Column
    private String status;


}
