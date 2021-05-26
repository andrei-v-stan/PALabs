package rest;

import org.springframework.http.HttpStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.util.Date;

@RestControllerAdvice
public class ControllerHandler {
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public Error Exception(WebRequest request) {
        Error message = new Error(HttpStatus.NOT_FOUND.value(),  new Date());
        return message;
    }
    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.CONFLICT)
    public Error conflictException(WebRequest request) {
        Error message = new Error(HttpStatus.CONFLICT.value(), new Date());
        return message;
    }

}
