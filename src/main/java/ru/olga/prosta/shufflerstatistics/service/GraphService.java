package ru.olga.prosta.shufflerstatistics.service;

import org.springframework.stereotype.Service;
import ru.olga.prosta.shufflerstatistics.model.Discipline;
import ru.olga.prosta.shufflerstatistics.model.wrapper.GraphData;

@Service
public class GraphService {
    public GraphData getGraph(Long playerId, Discipline discipline, Long season){
        return null;
    }
    public GraphData getGraph(Long playerId, Discipline discipline){
        Long defaultSeason = 0L;
        return getGraph(playerId, discipline, defaultSeason);
    }

}
