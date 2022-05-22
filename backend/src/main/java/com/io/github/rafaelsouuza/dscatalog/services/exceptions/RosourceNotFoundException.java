package com.io.github.rafaelsouuza.dscatalog.services.exceptions;

public class RosourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public RosourceNotFoundException(String message) {
        super(message);
    }
}
