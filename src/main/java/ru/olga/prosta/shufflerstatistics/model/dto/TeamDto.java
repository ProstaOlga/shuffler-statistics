package ru.olga.prosta.shufflerstatistics.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@Accessors(chain = true)
public class TeamDto {
    private Boolean winner;

    private List<PlayerDto> players;
}
