package com.kodilla.good.patterns.airline;

public class SearchingApplication {
    public static void main(String[]args){
        String myCity="Wroclaw";
        String destinationCity= "Gdańsk";

        SearchingForFlights searchingForFlights= new SearchingForFlights();
        searchingForFlights.searchingFromCity(myCity);
        System.out.println();

        searchingForFlights.searchingToCity(myCity);
        System.out.println();

        searchingForFlights.searchingThroughAnotherCity(myCity, destinationCity);
    }
}
