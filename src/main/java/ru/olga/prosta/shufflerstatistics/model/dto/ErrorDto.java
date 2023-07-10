package ru.olga.prosta.shufflerstatistics.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@AllArgsConstructor
@Accessors(chain = true)
public class ErrorDto {
    private String timestamp;
    private Integer statusCode;
    private String error;
    private String message;
    private String path;
}
