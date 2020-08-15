package com.choupies.fdj.fdjback.dto.ticketloterie;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class TicketLotoCreerDtoIn {

    @ApiModelProperty(value = "numeros", example = "12.15.49.36.26.01", required = true)
    private String numeros;

    @ApiModelProperty(value = "code", example = "Q99856341", required = true)
    private String codeTicket;

    @ApiModelProperty(value = "options", example = "[SECOND_TIRAGE]")
        private List<String> codeOption;
}