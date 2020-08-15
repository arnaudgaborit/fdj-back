package com.choupies.fdj.fdjback.dto.ticketloterie;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class TicketLotoCreerDtoOut {

    @ApiModelProperty(value = "id", example = "25462184841", required = true)
    private Long id;

    @ApiModelProperty(value = "cout", example = "2.5", required = true)
    private Double cout;

    @ApiModelProperty(value = "ticket", required = true)
    private TicketLotoCreerDtoIn ticketLotoCreerDtoIn;

}
