package ru.olga.prosta.shufflerstatistics.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping(CHAT_NAME)
    public WebResponse<LadderData> getChatLadder(
            @PathVariable String chatName,
            @RequestParam String discipline,
            @RequestParam(required = false) Long season) {
        return new WebResponse<>(ladderService.getLadder(chatName, discipline, season));
    }
}
