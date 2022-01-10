package com.kodilla.good.patterns.airline;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class ListOfAllFlights {
    public Map<Integer, Flight> allOfFlights(){
        Flight WroclawToGdansk1= new Flight(1324, "Wroclaw", "Gdańsk",
                LocalTime.of(13,20),LocalTime.of(14,10));
        Flight WroclawToGdansk2= new Flight(1244, "Wroclaw", "Gdańsk",
                LocalTime.of(15,30), LocalTime.of(16,30));
        Flight GdanskToWroclaw= new Flight(4321,"Gdańsk", "Wroclaw",
                LocalTime.of(10,50), LocalTime.of(11, 45));
        Flight WroclawToWarsaw= new Flight(248, "Wroclaw", "Warszawa",
                LocalTime.of(10, 20), LocalTime.of(11,00));
        Flight WarsawToGdansk= new Flight(453, "Warszawa", "Gdańsk",
                LocalTime.of(12,00), LocalTime.of(12, 45));
        Map<Integer, Flight> allOfFlights= new HashMap<>();
        allOfFlights.put(WroclawToGdansk1.getNumberOfFlights(), WroclawToGdansk1);
        allOfFlights.put(WroclawToGdansk2.getNumberOfFlights(), WroclawToGdansk2);
        allOfFlights.put(GdanskToWroclaw.getNumberOfFlights(), GdanskToWroclaw);
        allOfFlights.put(WroclawToWarsaw.getNumberOfFlights(), WroclawToWarsaw);
        allOfFlights.put(WarsawToGdansk.getNumberOfFlights(), WarsawToGdansk);

        return allOfFlights;
    }
}
