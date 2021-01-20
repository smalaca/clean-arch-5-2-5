package com.smalaca.rentalapplication.domain.apartment;

import lombok.Builder;
import lombok.Getter;

import java.util.Map;

@Builder
@Getter
public class NewApartmentDto {
    private final String ownerId;
    private final String street;
    private final String postalCode;
    private final String houseNumber;
    private final String apartmentNumber;
    private final String city;
    private final String country;
    private final String description;
    private final Map<String, Double> spacesDefinition;
}