package com.choupies.fdj.fdjback.service;

import com.choupies.fdj.fdjback.dto.option.CreerOptionDtoIn;
import com.choupies.fdj.fdjback.dto.option.CreerOptionDtoOut;
import com.choupies.fdj.fdjback.model.Option;
import com.choupies.fdj.fdjback.repository.OptionRepository;
import com.choupies.fdj.fdjback.service.mapper.impl.OptionMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class OptionService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OptionService.class);

    private final OptionRepository optionRepository;
    private final OptionMapper optionMapper;

    public OptionService(OptionRepository optionRepository, OptionMapper optionMapper) {
        this.optionRepository = optionRepository;
        this.optionMapper = optionMapper;
    }

    public CreerOptionDtoOut creerOption(CreerOptionDtoIn creerOptionDtoIn) {
        LOGGER.debug("CreerOption");
        Option option = optionMapper.convert(creerOptionDtoIn);
        option = optionRepository.save(option);

        CreerOptionDtoOut creerOptionDtoOut = new CreerOptionDtoOut();
        creerOptionDtoOut.setId(option.getId());

        return creerOptionDtoOut;
    }
}
