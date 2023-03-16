package ru.olga.prosta.shufflerstatistics.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ChatController.CHAT)
@RequiredArgsConstructor
public class ChatController {
    public static final String CHAT = "/chat";
    public static final String CHAT_NAME = "/{chatName}";
}
