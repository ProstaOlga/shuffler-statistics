package ru.olga.prosta.shufflerstatistics.model.wrapper;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.olga.prosta.shufflerstatistics.model.dto.SeasonDto;

import java.util.List;

@Getter
@Setter
@Accessors(chain = true)
@RequiredArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SeasonData extends WebPayload {
    private final List<SeasonDto> seasons;
}
