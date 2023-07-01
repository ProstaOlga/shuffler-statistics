package ru.olga.prosta.shufflerstatistics.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.olga.prosta.shufflerstatistics.model.wrapper.PlayerData;
import ru.olga.prosta.shufflerstatistics.model.wrapper.WebResponse;
import ru.olga.prosta.shufflerstatistics.service.PlayerService;

import static ru.olga.prosta.shufflerstatistics.controller.PlayerController.PLAYER;
@RestController
@RequestMapping(PLAYER)
@RequiredArgsConstructor
public class PlayerController {
    public static final String PLAYER = "/player";
    public static final String PLAYER_ID = "/{player_id}";

    private final PlayerService playerService;
    @GetMapping(PLAYER_ID)
    public WebResponse<PlayerData> getPlayer(
            @PathVariable Long playerId,
            @RequestParam String discipline,
            @RequestParam(required = false) Long season){
        return new WebResponse<>(playerService.getPlayer(playerId, discipline, season));
    }

}
