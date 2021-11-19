package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Germany implements Country{
    BigDecimal peopleQuantityOfCountry=new BigDecimal("80000000");

    public BigDecimal getPeopleQuantity(){
        return peopleQuantityOfCountry;
    }
}
