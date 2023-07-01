package ru.olga.prosta.shufflerstatistics.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.olga.prosta.shufflerstatistics.model.wrapper.GraphData;
import ru.olga.prosta.shufflerstatistics.model.wrapper.WebResponse;
import ru.olga.prosta.shufflerstatistics.service.GraphService;

import static ru.olga.prosta.shufflerstatistics.controller.GraphController.GRAPH;
import static ru.olga.prosta.shufflerstatistics.controller.PlayerController.PLAYER_ID;

@RestController
@RequestMapping(GRAPH)
@RequiredArgsConstructor
public class GraphController {
    public static final String GRAPH = "/graph";

    private final GraphService graphService;

    @GetMapping(PLAYER_ID)
    public WebResponse<GraphData> getGraph(
            @PathVariable Long playerId,
            @RequestParam String discipline,
            @RequestParam(required = false) Long season) {
        return new WebResponse<>(graphService.getGraph(playerId, discipline, season));
    }
}
