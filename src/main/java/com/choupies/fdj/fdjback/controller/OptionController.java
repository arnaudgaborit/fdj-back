package com.choupies.fdj.fdjback.controller;

import com.choupies.fdj.fdjback.dto.option.CreerOptionDtoIn;
import com.choupies.fdj.fdjback.dto.option.CreerOptionDtoOut;
import com.choupies.fdj.fdjback.service.OptionService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/option")
public class OptionController {

    private static final Logger LOGGER = LoggerFactory.getLogger(OptionController.class);

    private final OptionService optionService;

    public OptionController(OptionService optionService) {
        this.optionService = optionService;
    }

    @PostMapping("/Loto")
    @ApiOperation(value = "Créer un ticket de loto")
    public CreerOptionDtoOut creerOption(@RequestBody CreerOptionDtoIn creerOptionDtoIn) {
        LOGGER.info("Appel au service créer option : creerOptionDtoIn={}",creerOptionDtoIn);
        return this.optionService.creerOption(creerOptionDtoIn);
    }

}
