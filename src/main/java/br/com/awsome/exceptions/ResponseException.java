package br.com.awsome.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

public class ResponseException extends RuntimeException{
    public ResponseException(String msg) {
        super(msg);
    }

    public ResponseException(String msg,Throwable cause) {
        super(msg,cause);
    }
}
