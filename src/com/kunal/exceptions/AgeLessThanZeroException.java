package com.kunal.exceptions;

public class AgeLessThanZeroException extends IllegalArgumentException{

    public AgeLessThanZeroException(String s) {
        super(s);
    }

    public AgeLessThanZeroException(Throwable cause) {
        super(cause);
    }

    public AgeLessThanZeroException(String message, Throwable cause) {
        super(message, cause);
    }
}
