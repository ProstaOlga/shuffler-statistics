package ru.olga.prosta.shufflerstatistics.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Accessors(chain = true)
@JsonRootName("games")
public class GameDto {
    private Long id;

    private String date;

    private Integer change;

    private List<TeamDto> teams;
}
