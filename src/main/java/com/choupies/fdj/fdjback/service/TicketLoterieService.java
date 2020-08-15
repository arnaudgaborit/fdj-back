package com.choupies.fdj.fdjback.service;

import com.choupies.fdj.fdjback.dto.ticketloterie.TicketLotoCreerDtoIn;
import com.choupies.fdj.fdjback.dto.ticketloterie.TicketLotoCreerDtoOut;
import com.choupies.fdj.fdjback.model.TicketLoterie;
import com.choupies.fdj.fdjback.model.enums.TypeLoterie;
import com.choupies.fdj.fdjback.repository.TicketLoterieRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TicketLoterieService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TicketLoterieService.class);

    private final TicketLoterieRepository ticketLoterieRepository;

    public TicketLoterieService(TicketLoterieRepository ticketLoterieRepository) {
        this.ticketLoterieRepository = ticketLoterieRepository;
    }

    public TicketLotoCreerDtoOut creerTicketLoto(TicketLotoCreerDtoIn ticketLotoCreerDtoIn) {
        LOGGER.debug("CreerTickerLoto");
        TicketLoterie ticketLoterie = new TicketLoterie();
        ticketLoterie.setType(TypeLoterie.LOTO);
        ticketLoterie.setCodeTicket(ticketLotoCreerDtoIn.getCodeTicket());
        ticketLoterie.setNumeros(ticketLotoCreerDtoIn.getNumeros());
        ticketLoterie.setOptions(ticketLoterie.getOptions());

        ticketLoterie = ticketLoterieRepository.save(ticketLoterie);

        TicketLotoCreerDtoOut ticketLotoCreerDtoOut = new TicketLotoCreerDtoOut();
        ticketLotoCreerDtoOut.setTicketLotoCreerDtoIn(ticketLotoCreerDtoIn);
        ticketLotoCreerDtoOut.setId(ticketLoterie.getId());

        Double cout = TypeLoterie.LOTO.coutSansOption;

        ticketLotoCreerDtoOut.setCout(cout);

        return ticketLotoCreerDtoOut;
    }
}
