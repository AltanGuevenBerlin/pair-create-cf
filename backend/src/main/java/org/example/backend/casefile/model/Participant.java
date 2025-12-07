package org.example.backend.casefile.model;

import java.util.List;

public record Participant(
        String title,
        String gender,
        String first_name,
        String last_name,
        String birth_date,
        String customer_number,
        String preferred_communication_language,

        CompanyName companyName,
        List<BankAccount> bankAccounts,
        List<Email> emails,
        List<Phone> phones,
        List<Address> addresses

) {
}
