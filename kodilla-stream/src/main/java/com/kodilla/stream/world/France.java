package com.kodilla.stream.world;

import java.math.BigDecimal;

public class France implements Country{
    BigDecimal peopleQuantityOfCountry=new BigDecimal("85000000");

    public BigDecimal getPeopleQuantity(){
        return peopleQuantityOfCountry;
    }
}
