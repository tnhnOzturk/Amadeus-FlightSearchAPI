package com.flightsearch.flightSearch;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightService {
    @Autowired
    private FlightRepository flightRepository;
    public List<Flight> allFlights() {
        return flightRepository.findAll();
    }

    public Optional<Flight> singleFlight(int flightId) {
        return flightRepository.findByFlightId(flightId);
    }

    public Flight createFlight(int flightId, String originAirport, String destinationAirport, String departureDate, String departureTime, String returnDate, String returnTime, int price) {
        return flightRepository.insert(new Flight(flightId, originAirport,  destinationAirport,  departureDate,  departureTime, returnDate, returnTime, price));
    }

    public Flight deleteFlight(int flightId) {
        boolean exists = flightRepository.existsByFlightId(flightId);
        if(!exists){
            throw new IllegalStateException(
                    "flight with flightId " + flightId + " does not exist");
        }
        return flightRepository.deleteByFlightId(flightId);
    }
}
