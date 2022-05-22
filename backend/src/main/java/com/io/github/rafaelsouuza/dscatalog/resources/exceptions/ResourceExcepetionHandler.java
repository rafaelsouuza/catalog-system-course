package com.io.github.rafaelsouuza.dscatalog.resources.exceptions;

import com.io.github.rafaelsouuza.dscatalog.services.exceptions.RosourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;

@ControllerAdvice
public class ResourceExcepetionHandler {

    @ExceptionHandler(RosourceNotFoundException.class)
    public ResponseEntity<StandardError> entityNotFound(RosourceNotFoundException e,
                                                        HttpServletRequest request) {
        StandardError err = new StandardError();
        err.setTimestamp(Instant.now());
        err.setStatus(HttpStatus.NOT_FOUND.value());
        err.setError("Resource not found");
        err.setMessage(e.getMessage());
        err.setPath(request.getRequestURI());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
    }
}
