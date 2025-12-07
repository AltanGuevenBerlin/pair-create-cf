package org.example.backend.casefile.model;

import java.time.LocalDate;

public record CreditorFee(
        String type,
        String amount,
        String original_amount,
        LocalDate booking_date
) {
}
