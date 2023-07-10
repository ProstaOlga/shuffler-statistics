package ru.olga.prosta.shufflerstatistics.service;

import org.springframework.stereotype.Service;
import ru.olga.prosta.shufflerstatistics.model.Discipline;
import ru.olga.prosta.shufflerstatistics.model.wrapper.PlayerData;

@Service
public class PlayerService {
    public PlayerData getPlayer(Long playerId, Discipline discipline, Long season){
        return null;
    }

    public PlayerData getPlayer(Long playerId, Discipline discipline){
        Long defaultSeason = 0L;
        return getPlayer(playerId, discipline, defaultSeason);
    }
}
