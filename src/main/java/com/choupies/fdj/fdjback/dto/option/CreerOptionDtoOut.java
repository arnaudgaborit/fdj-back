package com.choupies.fdj.fdjback.dto.option;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class CreerOptionDtoOut implements Serializable {

    private static final long serialVersionUID = 4670403262909365608L;

    @ApiModelProperty(value = "id", example = "123456789")
    private Long id;
}
