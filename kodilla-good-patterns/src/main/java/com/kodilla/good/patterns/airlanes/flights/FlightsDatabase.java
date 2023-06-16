package com.kodilla.good.patterns.airlanes.flights;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class FlightsDatabase {

    private final Set<Flight> flights = new HashSet<>();

    public FlightsDatabase() {

        flights.add(new Flight(Airport.KRAKOW, Airport.WARSAW,
                LocalTime.of(5,11), LocalTime.of(6, 51)));
        flights.add(new Flight(Airport.KRAKOW, Airport.WARSAW,
                LocalTime.of(3,11), LocalTime.of(9, 51)));
        flights.add(new Flight(Airport.KRAKOW, Airport.POZNAN,
                LocalTime.of(7,11), LocalTime.of(7, 44)));
        flights.add(new Flight(Airport.KRAKOW, Airport.GDANSK,
                LocalTime.of(9,22), LocalTime.of(9, 15)));
        flights.add(new Flight(Airport.GDANSK, Airport.WARSAW,
                LocalTime.of(11,12), LocalTime.of(12, 52)));
        flights.add(new Flight(Airport.GDANSK, Airport.POZNAN,
                LocalTime.of(15,13), LocalTime.of(15, 43)));
        flights.add(new Flight(Airport.GDANSK, Airport.KRAKOW,
                LocalTime.of(13,14), LocalTime.of(14, 9)));
        flights.add(new Flight(Airport.POZNAN, Airport.GDANSK,
                LocalTime.of(9,30), LocalTime.of(10, 10)));
        flights.add(new Flight(Airport.POZNAN, Airport.KRAKOW,
                LocalTime.of(15,15), LocalTime.of(15, 55)));
        flights.add(new Flight(Airport.POZNAN, Airport.WARSAW,
                LocalTime.of(16,18), LocalTime.of(16, 40)));
        flights.add(new Flight(Airport.WARSAW, Airport.GDANSK,
                LocalTime.of(9,56), LocalTime.of(10, 37)));
        flights.add(new Flight(Airport.WARSAW, Airport.GDANSK,
                LocalTime.of(12,42), LocalTime.of(13, 15)));
    }

    public Set<Flight> getFlights() {
        return flights;
    }
}