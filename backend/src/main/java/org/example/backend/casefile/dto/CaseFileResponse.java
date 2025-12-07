package org.example.backend.casefile.dto;

import org.example.backend.casefile.model.CaseFileStatus;
import org.example.backend.casefile.model.MainClaim;
import org.example.backend.casefile.model.Participant;

import java.util.List;

public record CaseFileResponse (
        String id,
        String merchant,
        MainClaim mainClaim,
        List<Participant> participants,
        CaseFileStatus status
){
}
