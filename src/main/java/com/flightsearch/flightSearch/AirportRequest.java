package com.flightsearch.flightSearch;

public class AirportRequest {

    private String municipality;
    private String iataCode;

    public AirportRequest() {
    }

    public AirportRequest(String municipality, String iataCode) {
        this.municipality = municipality;
        this.iataCode = iataCode;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public String getIataCode() {
        return iataCode;
    }

    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }
}
