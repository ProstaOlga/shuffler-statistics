package ru.olga.prosta.shufflerstatistics.model.wrapper;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

public class WebResponse<T> extends ResponseEntity<T> {
    public WebResponse(T body) {
        this(body, HttpStatus.OK);
    }

    public WebResponse(T body, HttpStatusCode status) {
        super(body, status);
    }
}
