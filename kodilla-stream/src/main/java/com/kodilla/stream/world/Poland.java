package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Poland implements Country{
    BigDecimal peopleQuantityOfCountry=new BigDecimal("38000000");

    public BigDecimal getPeopleQuantity(){
        return peopleQuantityOfCountry;
    }
}
