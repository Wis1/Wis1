package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;


public class FlightSearchEngine {
    public void findFlight(Flight flight)throws RouteNotFoundException {
        Map<String, Boolean> mapOfFlight = new HashMap();
        mapOfFlight.put("Bergamo", true);
        mapOfFlight.put("Warsaw-Modlin", true);
        mapOfFlight.put("Berlin-Schonefeld", true);

        if(mapOfFlight.get(flight.getArrivalAirport())!=null)
            System.out.println("You can flight to: " + flight.getArrivalAirport());
        else
            throw new RouteNotFoundException("Destination airport not found");
    }
}
