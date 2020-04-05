package br.com.awsome.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResponseException extends RuntimeException {
    public ResponseException(String msg) {
        super(msg);
    }
}
