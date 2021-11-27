package com.kodilla.exception.test;

public class FlightSearchingRunner {
    public static void main (String[]args){

        Flight flight= new Flight("Warsaw", "New York");
        Flight flight1= new Flight("Berlin", "Warsaw-Modlin");
        FlightSearchEngine flightSearchEngine= new FlightSearchEngine();
        try {
            flightSearchEngine.findFlight(flight);
        }catch (RouteNotFoundException e){
            System.out.println("You can't flight to: " + flight.getArrivalAirport());
            System.out.println("Error "+e);
        }
        try {
            flightSearchEngine.findFlight(flight1);
        }catch (RouteNotFoundException e){
            System.out.println("You can't flight to: " + flight1.getArrivalAirport());
            System.out.println("Error "+e);
        }

    }
}
