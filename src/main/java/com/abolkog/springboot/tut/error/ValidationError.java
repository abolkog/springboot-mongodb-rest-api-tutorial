package com.abolkog.springboot.tut.error;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Khalid Elshafie <abolkog@gmail.com>
 * @Created 18/09/2018 10:53 PM.
 */
public class ValidationError {

    private List<String> errors;

    private String uri;


    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private Date timestamp;

    public ValidationError() {
        this.timestamp = new Date();
        this.errors = new ArrayList<>();
    }

    public void addError(String error) {
        this.errors.add(error);
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
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
