package com.choupies.fdj.fdjback.service.mapper;

import com.choupies.fdj.fdjback.dto.option.ConsulterOptionDtoOut;
import com.choupies.fdj.fdjback.dto.option.CreerOptionDtoIn;
import com.choupies.fdj.fdjback.model.Option;

public interface OptionConverter {
    Option convert(ConsulterOptionDtoOut consulterOptionDtoOut);
    Option convert(CreerOptionDtoIn creerOptionDtoIn);
}
