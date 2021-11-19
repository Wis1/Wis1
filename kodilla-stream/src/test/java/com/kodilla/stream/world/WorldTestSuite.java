package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity(){

        //Given
        World world= new World();
        Continent continent= new Continent();
        world.addContinents(continent);
        continent.addCountry(new Country("Poland", new BigDecimal("38000000")));
        continent.addCountry(new Country("Germany", new BigDecimal("80000000")));
        continent.addCountry(new Country("France", new BigDecimal("85000000")));

        //When
        BigDecimal totalPeopleQuantity= world.getPeopleQuantity();

        //Then
        BigDecimal expectedResult= new BigDecimal("203000000");
        assertEquals(expectedResult,totalPeopleQuantity );

    }
}
