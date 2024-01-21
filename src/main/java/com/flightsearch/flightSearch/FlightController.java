package com.flightsearch.flightSearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/flights")
public class FlightController {
    @Autowired
    private FlightService flightService;
    @GetMapping
    public ResponseEntity<List<Flight>> getAllFlights() {
        return new ResponseEntity<List<Flight>>(flightService.allFlights(), HttpStatus.OK);
    }
    @GetMapping("/{flightId}")
    public ResponseEntity<Optional<Flight>> getSingleFlight(@PathVariable int flightId) {
        return new ResponseEntity<Optional<Flight>>(flightService.singleFlight(flightId), HttpStatus.OK);
    }
    @PostMapping("/oneway")
    public ResponseEntity<Flight> createOneWayFlight(@RequestBody OneWayFlightRequest payload) {
        return new ResponseEntity<Flight>(flightService.createFlight(payload.getFlightId(), payload.getOriginAirport(), payload.getDestinationAirport(), payload.getDepartureDate(), payload.getDepartureTime(), "", "", payload.getPrice()), HttpStatus.CREATED);
    }
    @PostMapping("/round")
    public ResponseEntity<Flight> createRoundFlight(@RequestBody RoundFlightRequest payload) {
        return new ResponseEntity<Flight>(flightService.createFlight(payload.getFlightId(), payload.getOriginAirport(), payload.getDestinationAirport(), payload.getDepartureDate(), payload.getDepartureTime(), payload.getReturnDate(), payload.getReturnTime(), payload.getPrice()), HttpStatus.CREATED);
    }
    @DeleteMapping("/{flightId}")
    public ResponseEntity<Flight> deleteFlight(@PathVariable int flightId) {
        return new ResponseEntity<Flight>(flightService.deleteFlight(flightId), HttpStatus.NO_CONTENT);
    }
}
