package com.choupies.fdj.fdjback.service;

import com.choupies.fdj.fdjback.dto.ticketloterie.TicketLotoCreerDtoIn;
import com.choupies.fdj.fdjback.dto.ticketloterie.TicketLotoCreerDtoOut;
import com.choupies.fdj.fdjback.model.TicketLoterie;
import com.choupies.fdj.fdjback.model.enums.TypeLoterie;
import com.choupies.fdj.fdjback.repository.TicketLoterieRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class TicketLoterieService {

    private final static Logger LOGGER = LoggerFactory.getLogger(TicketLoterieService.class);

    private TicketLoterieRepository ticketLoterieRepository;

    public TicketLoterieService(TicketLoterieRepository ticketLoterieRepository) {
        this.ticketLoterieRepository = ticketLoterieRepository;
    }

    public TicketLotoCreerDtoOut creerTicketLoto(TicketLotoCreerDtoIn ticketLotoCreerDtoIn) {

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

//        if(Objects.nonNull(ticketLotoCreerDtoIn.getTypeOptions()) && !ticketLotoCreerDtoIn.getTypeOptions().isEmpty()) {
//            for (TypeOption typeOption : ticketLotoCreerDtoIn.getTypeOptions()) {
//                cout += typeOption.cout;
//            }
//        }

        ticketLotoCreerDtoOut.setCout(cout);

        return ticketLotoCreerDtoOut;
    }
}
