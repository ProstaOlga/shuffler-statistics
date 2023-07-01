package ru.olga.prosta.shufflerstatistics.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlayerDto {
    private Long id;

    private String name;

    private String avatar;

    private Integer score;

    private Integer winCount;

    private Integer loseCount;
}
