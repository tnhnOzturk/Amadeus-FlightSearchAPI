package com.flightsearch.flightSearch;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FlightRepository extends MongoRepository<Flight, ObjectId> {
    Optional<Flight> findByFlightId(int flightId);

    boolean existsByFlightId(int flightId);

    Flight deleteByFlightId(int flightId);
}
