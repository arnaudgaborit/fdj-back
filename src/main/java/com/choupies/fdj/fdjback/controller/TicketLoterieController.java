package com.choupies.fdj.fdjback.controller;

import com.choupies.fdj.fdjback.dto.ticketloterie.TicketLotoCreerDtoIn;
import com.choupies.fdj.fdjback.dto.ticketloterie.TicketLotoCreerDtoOut;
import com.choupies.fdj.fdjback.service.TicketLoterieService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ticketLoterie")
public class TicketLoterieController {

    private final TicketLoterieService ticketLoterieService;

    public TicketLoterieController(TicketLoterieService ticketLoterieService) {
        this.ticketLoterieService = ticketLoterieService;
    }

    @PostMapping("/Loto")
    @ApiOperation(value = "Créer un ticket de loto")
    public TicketLotoCreerDtoOut creerTicketLoto(
            @RequestBody TicketLotoCreerDtoIn ticketLotoCreerDtoIn
    ) {
        return this.ticketLoterieService.creerTicketLoto(ticketLotoCreerDtoIn);
    }
}
