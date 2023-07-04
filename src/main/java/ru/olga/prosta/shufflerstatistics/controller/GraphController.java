package ru.olga.prosta.shufflerstatistics.controller;

import lombok.RequiredArgsConstructor;
import ru.olga.prosta.shufflerstatistics.model.Discipline;
import ru.olga.prosta.shufflerstatistics.model.wrapper.GraphData;
import ru.olga.prosta.shufflerstatistics.model.wrapper.WebResponse;
import ru.olga.prosta.shufflerstatistics.service.GraphService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static ru.olga.prosta.shufflerstatistics.controller.GraphController.GRAPH;
import static ru.olga.prosta.shufflerstatistics.controller.PlayerController.PLAYER_ID;

@RestController
@RequestMapping(GRAPH)
@RequiredArgsConstructor
public class GraphController {
    public static final String GRAPH = "/graph";

    private final GraphService graphService;

    @GetMapping(value = PLAYER_ID, params = {"discipline", "season"})
    public WebResponse<GraphData> getGraph(
            @PathVariable Long playerId,
            @RequestParam Discipline discipline,
            @RequestParam(required = false) Long season) {
        return new WebResponse<>(graphService.getGraph(playerId, discipline, season));
    }

    @GetMapping(value = PLAYER_ID, params = {"discipline"})
    public WebResponse<GraphData> getGraph(
            @PathVariable Long playerId,
            @RequestParam Discipline discipline) {
        return new WebResponse<>(graphService.getGraph(playerId, discipline));
    }
}
