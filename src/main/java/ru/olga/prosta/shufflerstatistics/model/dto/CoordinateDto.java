package ru.olga.prosta.shufflerstatistics.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Getter
@Setter
@Accessors(chain = true)
public class CoordinateDto {
    private String date;
    private Integer scope;
}
