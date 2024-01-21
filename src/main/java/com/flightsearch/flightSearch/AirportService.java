package com.flightsearch.flightSearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AirportService {
    @Autowired
    private AirportRepository airportRepository;
    public List<Airport> allAirports() {
        return airportRepository.findAll();
    }

    public Optional<Airport> singleAirport(String iataCode) {
        return airportRepository.findByIataCode(iataCode);
    }

    public Airport createAirport(String municipality, String iataCode) {
        return airportRepository.insert(new Airport(municipality, iataCode));
    }

    public Airport deleteAirport(String iataCode) {
        boolean exists = airportRepository.existsByIataCode(iataCode);
        if(!exists){
            throw new IllegalStateException(
                    "airport with iataCode " + iataCode + " does not exist");
        }
        return airportRepository.deleteByIataCode(iataCode);
    }
}
