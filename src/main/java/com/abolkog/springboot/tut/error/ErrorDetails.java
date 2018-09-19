package com.abolkog.springboot.tut.error;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author Khalid Elshafie <abolkog@gmail.com>
 * @Created 18/09/2018 10:35 PM.
 */
public class ErrorDetails {

    private String message;

    private String uri;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private Date timestamp;

    public ErrorDetails() {
        this.timestamp = new Date();
    }


    public ErrorDetails(String message, String uri) {
        this();
        this.message = message;
        this.uri = uri;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
