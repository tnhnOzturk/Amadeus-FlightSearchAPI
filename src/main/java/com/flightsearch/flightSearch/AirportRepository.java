package com.flightsearch.flightSearch;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface AirportRepository extends MongoRepository<Airport, String> {
    Optional<Airport> findByIataCode(String iataCode);

    boolean existsByIataCode(String iataCode);

    Airport deleteByIataCode(String iataCode);
}
