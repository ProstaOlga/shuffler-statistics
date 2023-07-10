package ru.olga.prosta.shufflerstatistics.service;

import org.springframework.stereotype.Service;
import ru.olga.prosta.shufflerstatistics.model.Discipline;
import ru.olga.prosta.shufflerstatistics.model.wrapper.GameData;

@Service
public class HistoryService {
    public GameData getGamesHistory(Long playerId, Discipline discipline, Long season){
        return null;
    }

    public GameData getGamesHistory(Long playerId, Discipline discipline){
        Long defaultSeason = 0L;
        return getGamesHistory(playerId, discipline, defaultSeason);
    }
}
