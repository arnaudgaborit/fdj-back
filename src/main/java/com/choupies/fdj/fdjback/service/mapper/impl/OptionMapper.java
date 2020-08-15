package com.choupies.fdj.fdjback.service.mapper.impl;

import com.choupies.fdj.fdjback.dto.option.ConsulterOptionDtoOut;
import com.choupies.fdj.fdjback.dto.option.CreerOptionDtoIn;
import com.choupies.fdj.fdjback.model.Option;
import com.choupies.fdj.fdjback.service.mapper.OptionConverter;
import org.springframework.stereotype.Component;

@Component
public class OptionMapper implements OptionConverter {

    @Override
    public Option convert(ConsulterOptionDtoOut consulterOptionDtoOut) {
        return null;
    }

    @Override
    public Option convert(CreerOptionDtoIn creerOptionDtoIn) {
        Option option = new Option();
        option.setActif(creerOptionDtoIn.isActif());
        option.setCode(creerOptionDtoIn.getCode());
        option.setCout(creerOptionDtoIn.getCout());
        option.setLibelle(creerOptionDtoIn.getLibelle());
        option.setTypeLoteries(creerOptionDtoIn.getTypeLoteries());
        return option;
    }
}
