package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    private final List<Continent> continents=new ArrayList<>();


    public void addContinents(Continent continent){
        continents.add(continent);
    }
    public List<Continent> getContinents() {
        return continents;
    }



    public BigDecimal getPeopleQuantity(){
        BigDecimal peopleQuantity;
        return peopleQuantity=getContinents().stream()
                .flatMap(continent->continent.getCountriesList().stream())
                .map(Country:: getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum,current)->sum=sum.add(current));

    }

}
