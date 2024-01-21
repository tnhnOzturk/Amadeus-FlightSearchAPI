package com.flightsearch.flightSearch;

import lombok.Getter;
import lombok.Setter;


public class RoundFlightRequest {

    private int flightId;
    private String originAirport;
    private String destinationAirport;
    private String departureDate;
    private String departureTime;
    private String returnDate;
    private String returnTime;
    private int price;

    public RoundFlightRequest() {
        // Default constructor for deserialization
    }

    public RoundFlightRequest(int flightId, String originAirport, String destinationAirport, String departureDate, String departureTime, String returnDate, String returnTime, int price) {
        this.flightId = flightId;
        this.originAirport = originAirport;
        this.destinationAirport = destinationAirport;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.returnDate = returnDate;
        this.returnTime = returnTime;
        this.price = price;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getOriginAirport() {
        return originAirport;
    }

    public void setOriginAirport(String originAirport) {
        this.originAirport = originAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
