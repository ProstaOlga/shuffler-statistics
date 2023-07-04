package ru.olga.prosta.shufflerstatistics.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.olga.prosta.shufflerstatistics.model.wrapper.SeasonData;
import ru.olga.prosta.shufflerstatistics.model.wrapper.WebResponse;
import ru.olga.prosta.shufflerstatistics.service.SeasonService;

import static ru.olga.prosta.shufflerstatistics.controller.SeasonController.SEASON;

@RestController
@RequestMapping(SEASON)
@RequiredArgsConstructor
public class SeasonController {
    public static final String SEASON = "/seasons";

    private final SeasonService seasonService;

    @GetMapping
    public WebResponse<SeasonData> getSeasons() {
        return new WebResponse<>(seasonService.getSeasons());
    }

}
