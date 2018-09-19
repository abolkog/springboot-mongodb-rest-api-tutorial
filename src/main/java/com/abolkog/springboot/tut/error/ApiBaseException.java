package com.abolkog.springboot.tut.error;

import org.springframework.http.HttpStatus;

/**
 * @author Khalid Elshafie <abolkog@gmail.com>
 * @Created 18/09/2018 10:45 PM.
 */
public abstract class ApiBaseException extends RuntimeException {

    public ApiBaseException(String message) {
        super(message);
    }

    public abstract HttpStatus getStatusCode();
}
