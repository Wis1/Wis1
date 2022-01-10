package com.kodilla.good.patterns.airline;

import java.time.LocalTime;

public class Flight {
    private int numberOfFlights;
    private String departureCity;
    private String cityOfArrival;
    private LocalTime timeOfDeparture;
    private LocalTime timeOfArrival;

    public Flight(int numberOfFlights, String departureCity, String cityOfArrival, LocalTime timeOfDeparture, LocalTime timeOfArrival) {
        this.numberOfFlights = numberOfFlights;
        this.departureCity = departureCity;
        this.cityOfArrival = cityOfArrival;
        this.timeOfDeparture = timeOfDeparture;
        this.timeOfArrival = timeOfArrival;
    }

    public int getNumberOfFlights() {
        return numberOfFlights;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getCityOfArrival() {
        return cityOfArrival;
    }

    public LocalTime getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public LocalTime getTimeOfArrival() {
        return timeOfArrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (numberOfFlights != flight.numberOfFlights) return false;
        return timeOfDeparture != null ? timeOfDeparture.equals(flight.timeOfDeparture) : flight.timeOfDeparture == null;
    }

    @Override
    public int hashCode() {
        int result = numberOfFlights;
        result = 31 * result + (timeOfDeparture != null ? timeOfDeparture.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "numberOfFlights=" + numberOfFlights +
                ", departureCity='" + departureCity + '\'' +
                ", cityOfArrival='" + cityOfArrival + '\'' +
                ", timeOfDeparture=" + timeOfDeparture +
                ", timeOfArrival=" + timeOfArrival +
                '}';
    }
}
