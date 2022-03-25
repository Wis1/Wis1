package com.kodilla.kodillalibrary.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@AllArgsConstructor
//@Entity
public class CopiesBook {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private Long idOfTitle;

    @Column
    private String status;


}
