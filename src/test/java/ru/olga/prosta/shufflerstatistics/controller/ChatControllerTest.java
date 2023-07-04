package ru.olga.prosta.shufflerstatistics.controller;

import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.olga.prosta.shufflerstatistics.common.AbstractTest;

import java.io.IOException;

import static ru.olga.prosta.shufflerstatistics.controller.ChatController.CHAT;

@SuppressWarnings("resource")
class ChatControllerTest extends AbstractTest {

    @Autowired
    private OkHttpClient httpClient;
    private final String BASE_URL = "http://localhost";

    @Test
    void testGetChatLadderWithSeason() throws IOException {
        var url = HttpUrl
                .parse(BASE_URL + ":" + serverPort + apiPath + CHAT + "/"+ CHAT_NAME)
                .newBuilder()
                .addQueryParameter("discipline", "kicker")
                .addQueryParameter("season", "1")
                .build();
        var request = new Request.Builder()
                .url(url)
                .build();
        var response = httpClient
                .newCall(request)
                .execute();
        Assertions.assertThat(response.code()).isEqualTo(200);
    }

    @Test
    void testGetChatLadderWithoutSeason()  throws IOException{
        HttpUrl.Builder urlBuilder
                = HttpUrl.parse(BASE_URL + "/1").newBuilder();
        urlBuilder.addQueryParameter("discipline", "kicker");
        String url = urlBuilder.build().toString();

        Request request = new Request.Builder()
                .url(url)
                .build();
        Call call = httpClient.newCall(request);
        Response response = call.execute();
        Assertions.assertThat(response.code()).isEqualTo(200);
    }
}