package com.aade.aadebe.exceptions;

public class AfmNotExistsException extends IllegalArgumentException {
    public static final String DEFAULT_ERROR_MESSAGE = "Afm does not exist";

    public AfmNotExistsException() { super(DEFAULT_ERROR_MESSAGE); }
}
