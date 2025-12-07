package org.example.backend.casefile.model;

public record BankAccount(
        String iban,
        String bic,
        String bankName
) {
}
