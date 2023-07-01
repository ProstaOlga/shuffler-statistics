package ru.olga.prosta.shufflerstatistics.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.olga.prosta.shufflerstatistics.model.wrapper.LadderData;
import ru.olga.prosta.shufflerstatistics.model.wrapper.WebResponse;
import ru.olga.prosta.shufflerstatistics.service.LadderService;

@RestController
@RequestMapping(ChatController.CHAT)
@RequiredArgsConstructor
public class ChatController {
    private final LadderService ladderService;

    public static final String CHAT = "/chat";
    public static final String CHAT_NAME = "/{chatName}";

    @GetMapping(CHAT_NAME)
    public WebResponse<LadderData> getChatLadder(
            @PathVariable String chatName,
            @RequestParam String discipline,
            @RequestParam(required =false) Long season){
        return new WebResponse<>(ladderService.getLadder(chatName, discipline, season));
    }
}
