package com.flightsearch.flightSearch;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Document(collection = "FlightSchedules")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flight {
    @Id
    private ObjectId id;
    private int flightId;
    private String originAirport;
    private String destinationAirport;
    private String departureDate;
    private String departureTime;
    private String returnDate;
    private String returnTime;
    private int price;

    public Flight(int flightId, String originAirport, String destinationAirport, String departureDate, String departureTime, String returnDate, String returnTime, int price) {
        this.flightId = flightId;
        this.originAirport = originAirport;
        this.destinationAirport = destinationAirport;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.returnDate = returnDate;
        this.returnTime = returnTime;
        this.price = price;
    }

    public Flight(int flightId, String originAirport, String destinationAirport, String departureDate, String departureTime, int price) {
        this.flightId = flightId;
        this.originAirport = originAirport;
        this.destinationAirport = destinationAirport;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.price = price;
    }

}
