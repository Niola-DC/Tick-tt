package org.dafe.tripTix.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class ApiException extends RuntimeException {
    public ApiException(String message){super(message);}
    public ApiException(){super("api error occurred");}
}