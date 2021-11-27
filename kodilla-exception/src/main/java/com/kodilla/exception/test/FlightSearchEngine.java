package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;


public class FlightSearchEngine {
    public void findFlight(Flight flight)throws RouteNotFoundException {
        boolean destinationAvailability = false;
        Map<String, Boolean> mapOfFlight = new HashMap();
        mapOfFlight.put("Bergamo", true);
        mapOfFlight.put("Warsaw-Modlin", true);
        mapOfFlight.put("Berlin-Schonefeld", true);

        for(Map.Entry<String,Boolean> entry: mapOfFlight.entrySet()) {
            if (entry.getKey() == flight.getArrivalAirport()) {
                System.out.println("You can flight to: " + flight.getArrivalAirport());
                destinationAvailability = entry.getValue();
            }
        }
            if(!destinationAvailability)
                throw new RouteNotFoundException("Destination airport not found");
    }
}
