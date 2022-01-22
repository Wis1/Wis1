package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmacNew(){
        //Given
        Bigmac bigmac= new Bigmac.BigmacBuilder()
                .bun("sezam")
                .burgers(3)
                .sauce("standard")
                .ingredient("onion")
                .ingredient("bacon")
                .ingredient("cheese")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients= bigmac.getIngredients().size();
        //Then
        assertEquals(3, howManyIngredients);
    }
}