package com.kodilla.good.patterns.airline;

import java.util.Map;
import java.util.stream.Collectors;

public class SearchingForFlights {
    private ListOfAllFlights listOfAllFlights = new ListOfAllFlights();

    public void searchingFromCity(String city) {
        listOfAllFlights.allOfFlights().entrySet().stream()
                .filter(entry -> entry.getValue().getDepartureCity().equals(city))
                .map(entry -> entry.toString())
                .forEach(System.out::println);

    }

    public void searchingToCity(String city) {
        listOfAllFlights.allOfFlights().entrySet().stream()
                .filter(entry -> entry.getValue().getCityOfArrival().equals(city))
                .map(entry -> entry.toString())
                .forEach(System.out::println);
    }

    public void searchingThroughAnotherCity(String myCity, String destinationCity) {
        Map<Integer, Flight> mapOfFlightsFromMyCity = listOfAllFlights.allOfFlights().entrySet().stream()
                .filter(entry -> entry.getValue().getDepartureCity().equals(myCity))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        Map<Integer, Flight> mapOfFlightsToDestinationCity = listOfAllFlights.allOfFlights().entrySet().stream()
                .filter(entry -> entry.getValue().getCityOfArrival().equals(destinationCity))
                .collect(Collectors.toMap(entry->entry.getKey(), entry->entry.getValue()));

        for (Map.Entry<Integer, Flight> flight1 : mapOfFlightsFromMyCity.entrySet()) {
            for (Map.Entry<Integer, Flight> flight2 : mapOfFlightsToDestinationCity.entrySet()) {
                if (flight1.getValue().getCityOfArrival().equals(flight2.getValue().getDepartureCity()) &&
                        flight2.getValue().getTimeOfDeparture().compareTo(flight1.getValue().getTimeOfArrival()) > 0) {
                    System.out.println(flight1);
                    System.out.println(flight2);
                }
            }
        }
    }
}
