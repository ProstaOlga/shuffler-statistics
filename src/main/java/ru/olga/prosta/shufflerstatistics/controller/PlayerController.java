package ru.olga.prosta.shufflerstatistics.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.olga.prosta.shufflerstatistics.model.Discipline;
import ru.olga.prosta.shufflerstatistics.model.wrapper.PlayerData;
import ru.olga.prosta.shufflerstatistics.model.wrapper.WebResponse;
import ru.olga.prosta.shufflerstatistics.service.PlayerService;

import static ru.olga.prosta.shufflerstatistics.controller.PlayerController.PLAYER;

@RestController
@RequestMapping(PLAYER)
@RequiredArgsConstructor
public class PlayerController {
    public static final String PLAYER = "/player";
    public static final String PLAYER_ID = "/{playerId}";

    private final PlayerService playerService;

    @GetMapping(value = PLAYER_ID, params = {"discipline", "season"})
    public WebResponse<PlayerData> getPlayer(
            @PathVariable Long playerId,
            @RequestParam Discipline discipline,
            @RequestParam(required = false) Long season) {
        return new WebResponse<>(playerService.getPlayer(playerId, discipline, season));
    }

    @GetMapping(value = PLAYER_ID, params = {"discipline"})
    public WebResponse<PlayerData> getPlayer(
            @PathVariable Long playerId,
            @RequestParam Discipline discipline) {
        return new WebResponse<>(playerService.getPlayer(playerId, discipline));
    }
}
