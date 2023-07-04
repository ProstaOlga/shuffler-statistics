package ru.olga.prosta.shufflerstatistics.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class CoordinateDto {
    private String date;
    private Integer scope;
}
