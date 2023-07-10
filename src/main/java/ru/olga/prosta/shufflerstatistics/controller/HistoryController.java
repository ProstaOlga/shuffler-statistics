package ru.olga.prosta.shufflerstatistics.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.olga.prosta.shufflerstatistics.model.Discipline;
import ru.olga.prosta.shufflerstatistics.model.wrapper.GameData;
import ru.olga.prosta.shufflerstatistics.model.wrapper.WebResponse;
import ru.olga.prosta.shufflerstatistics.service.HistoryService;

import static ru.olga.prosta.shufflerstatistics.controller.HistoryController.HISTORY;
import static ru.olga.prosta.shufflerstatistics.controller.PlayerController.PLAYER_ID;

@RestController
@RequestMapping(HISTORY)
@RequiredArgsConstructor
public class HistoryController {
    public static final String HISTORY = "/history";

    private final HistoryService historyService;

    @GetMapping(value = PLAYER_ID, params = {"discipline", "season"})
    public WebResponse<GameData> getHistory(
            @PathVariable Long playerId,
            @RequestParam Discipline discipline,
            @RequestParam(required = false) Long season
    ) {
        return new WebResponse<>(historyService.getGamesHistory(playerId, discipline, season));
    }

    @GetMapping(value = PLAYER_ID, params = {"discipline"})
    public WebResponse<GameData> getHistory(
            @PathVariable Long playerId,
            @RequestParam Discipline discipline
    ) {
        return new WebResponse<>(historyService.getGamesHistory(playerId, discipline));
    }
}
