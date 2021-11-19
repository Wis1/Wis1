package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity(){

        //Given
        World world= new World();
        Continent continent= new Continent();
        world.addContinents(continent);
        continent.addCountry(new Poland());
        continent.addCountry(new Germany());
        continent.addCountry(new France());

        //When
        BigDecimal totalPeopleQuantity= world.getPeopleQuantity();

        //Then
        BigDecimal expectedResult= new BigDecimal("203000000");
        assertEquals(expectedResult,totalPeopleQuantity );

    }
}
