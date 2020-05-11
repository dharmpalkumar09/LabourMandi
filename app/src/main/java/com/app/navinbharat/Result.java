package com.app.navinbharat;

import java.io.Serializable;
import java.util.List;

public class Result<I,O> implements Serializable {
    private I inputObject;
    private O outputObject;
    private boolean isSuccess;
    private List<String> errors;
    private String message;

    public I getInputObject() {
        return inputObject;
    }

    public O getOutputObject() {
        return outputObject;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public List<String> getErrors() {
        return errors;
    }

    public String getMessage() {
        return message;
    }
}
