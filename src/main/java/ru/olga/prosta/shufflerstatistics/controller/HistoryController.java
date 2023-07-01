package ru.olga.prosta.shufflerstatistics.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping(PLAYER_ID)
    public WebResponse<GameData> getHistory(
            @PathVariable Long playerId,
            @RequestParam String discipline,
            @RequestParam(required = false) Long season
    ) {
        return new WebResponse<>(historyService.getGamesHistory(playerId, discipline, season));
    }
}
