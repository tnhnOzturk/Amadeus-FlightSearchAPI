package com.flightsearch.flightSearch;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Airports")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Airport {
    @Id
    private ObjectId id;
    private String municipality;
    private String iataCode;

    public Airport(String municipality, String iataCode) {
        this.municipality = municipality;
        this.iataCode = iataCode;
    }
}
