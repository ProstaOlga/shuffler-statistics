package ru.olga.prosta.shufflerstatistics.service;

import org.springframework.stereotype.Service;
import ru.olga.prosta.shufflerstatistics.model.Discipline;
import ru.olga.prosta.shufflerstatistics.model.wrapper.LadderData;

@Service
public class LadderService {
    public LadderData getLadder(String chatName, Discipline discipline, Long season){
        return null;
    }

    public LadderData getLadder(String chatName, Discipline discipline){
        Long defaultSeason = 0L;
        return getLadder(chatName, discipline, defaultSeason);
    }
}
