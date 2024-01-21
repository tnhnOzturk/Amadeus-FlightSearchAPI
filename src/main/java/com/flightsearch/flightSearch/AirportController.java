package com.flightsearch.flightSearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/airports")
public class AirportController {
    @Autowired
    private AirportService airportService;

    @GetMapping
    public ResponseEntity<List<Airport>> getAllAirports() {
        return new ResponseEntity<List<Airport>>(airportService.allAirports(), HttpStatus.OK);
    }

    @GetMapping("/{iataCode}")
    public ResponseEntity<Optional<Airport>> getSingleAirport(@PathVariable String iataCode) {
        return new ResponseEntity<Optional<Airport>>(airportService.singleAirport(iataCode.toUpperCase()), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Airport> createOneWayFlight(@RequestBody AirportRequest payload) {
        return new ResponseEntity<Airport>(airportService.createAirport(payload.getMunicipality(), payload.getIataCode()), HttpStatus.CREATED);
    }

    @DeleteMapping("/{iataCode}")
    public ResponseEntity<Airport> deleteAirport(@PathVariable String iataCode) {
        return new ResponseEntity<Airport>(airportService.deleteAirport(iataCode), HttpStatus.NO_CONTENT);
    }
}