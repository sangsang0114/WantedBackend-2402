package com.wanted.preonboarding.ticket.presentation;

import com.wanted.preonboarding.ticket.application.TicketSeller;
import com.wanted.preonboarding.ticket.domain.dto.PerformanceInfo;
import com.wanted.preonboarding.ticket.domain.dto.ReserveInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class ReserveController {
    private final TicketSeller ticketSeller;

    @GetMapping("/reserve")
    public boolean reservation() {
        System.out.println("reservation");

        return ticketSeller.reserve(ReserveInfo.builder()
            .performanceId(UUID.fromString("4438a3e6-b01c-11ee-9426-0242ac180002"))
            .reservationName("유진호")
            .reservationPhoneNumber("010-1234-1234")
            .reservationStatus("reserve")
            .amount(200000)
            .round(1)
            .line('A')
            .seat(1)
            .build()
        );
    }
}
