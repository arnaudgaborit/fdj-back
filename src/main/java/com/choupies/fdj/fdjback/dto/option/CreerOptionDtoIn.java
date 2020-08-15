package com.choupies.fdj.fdjback.dto.option;

import com.choupies.fdj.fdjback.model.enums.TypeLoterie;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class CreerOptionDtoIn {

    @ApiModelProperty(value = "code", example = "ST", required = true)
    private String code;

    @ApiModelProperty(value = "libelle", example = "Second Tirage", required = true)
    private String libelle;

    @ApiModelProperty(value = "cout", example = "1", required = true)
    private Double cout;

    @ApiModelProperty(value = "actif", example = "true", required = true)
    private boolean actif;

    @ApiModelProperty(value = "typeLoreries", example = "[LOTO]")
    private List<TypeLoterie> typeLoteries;

}
