package ru.olga.prosta.shufflerstatistics.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.olga.prosta.shufflerstatistics.model.Discipline;
import ru.olga.prosta.shufflerstatistics.model.wrapper.LadderData;
import ru.olga.prosta.shufflerstatistics.model.wrapper.WebResponse;
import ru.olga.prosta.shufflerstatistics.service.LadderService;

import static ru.olga.prosta.shufflerstatistics.controller.ChatController.CHAT;

@RestController
@RequestMapping(CHAT)
@RequiredArgsConstructor
public class ChatController {
    public static final String CHAT = "/chat";
    public static final String CHAT_NAME = "/{chatName}";

    private final LadderService ladderService;

    @GetMapping(value = CHAT_NAME,  params = {"discipline", "season"})
    public WebResponse<LadderData> getChatLadder(
            @PathVariable String chatName,
            @RequestParam("discipline") Discipline discipline,
            @RequestParam("season") Long season) {
        return new WebResponse<>(ladderService.getLadder(chatName, discipline, season));
    }

    @GetMapping(value = CHAT_NAME,  params = {"discipline"})
    public WebResponse<LadderData> getChatLadder(
            @PathVariable String chatName,
            @RequestParam("discipline") Discipline discipline) {
        return new WebResponse<>(ladderService.getLadder(chatName, discipline));
    }
}
