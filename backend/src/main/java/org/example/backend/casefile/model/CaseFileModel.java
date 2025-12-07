package org.example.backend.casefile.model;

import java.util.List;

public record CaseFileModel(
        String id,
        String merchant,        // z.B. demo_altan_de bei PAIR

        MainClaim mainClaim,    // Hauptforderung
        List<Participant> participants,     //Debitoren

        CaseFileStatus status      // z.B. New, closed usw.
) {
}
