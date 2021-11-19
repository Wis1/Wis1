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
        List<Continent> continentList= new ArrayList<>();
        continentList.add(new Continent());
        List<Country> countryList= new ArrayList<>();
        countryList.add(new Country());
        //When
        BigDecimal totalPeopleQuantity= continentList.stream()
                .flatMap(continent->continent.getCountriesList().stream())
                .map(Country:: getPeopleQuantity)
                .reduce(BigDecimal.ZERO,(sum,current)->sum=sum.add(current));

        //Then
        BigDecimal expectedResult= new BigDecimal("8500000000");
        assertEquals(expectedResult,totalPeopleQuantity );

    }
}
