package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final List<Country> countriesList= new ArrayList<>();

    public Continent(){
        countriesList.add(new Country());
    }

    public List<Country> getCountriesList() {
        return new ArrayList<>(countriesList);
    }
}
