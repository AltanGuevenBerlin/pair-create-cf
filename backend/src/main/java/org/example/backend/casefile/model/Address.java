package org.example.backend.casefile.model;

public record Address(
        boolean primary,
        String addressType,
        String street,
        String streetNumber,
        String streetWithNumber,
        String zip,
        String city,
        String country
) {
}
