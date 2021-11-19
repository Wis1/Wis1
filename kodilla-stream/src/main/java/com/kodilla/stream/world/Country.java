package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private String name;

    private BigDecimal peopleQuantity;

    public Country(String name, BigDecimal peopleQuantityOfCountry) {
        this.name = name;
        this.peopleQuantity = peopleQuantityOfCountry;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
}
