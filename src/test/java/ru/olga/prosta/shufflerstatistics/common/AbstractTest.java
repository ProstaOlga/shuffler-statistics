package ru.olga.prosta.shufflerstatistics.common;

import jakarta.annotation.Nonnull;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
import ru.olga.prosta.shufflerstatistics.config.HttpClientConfig;

import javax.validation.constraints.NotNull;



@ActiveProfiles("test")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Import(HttpClientConfig.class)
public class AbstractTest {

    protected static final String CHAT_NAME = "test";

    @LocalServerPort
    protected int serverPort;

    @Nonnull
    @Value("${server.servlet.context-path}")
    protected String apiPath;
}
